package com.koreait.apart;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.koreait.apart.model.ApartmentInfoDTO;
import com.koreait.apart.model.ApartmentInfoDomain;
import com.koreait.apart.model.ApartmentInfoEntity;
import com.koreait.apart.model.LocationCodeEntity;
import com.koreait.apart.model.ResponseDomain;

@Service
public class HomeService {

	@Autowired
	private HomeMapper mapper;
	
	public List<LocationCodeEntity> getExternalCd(){
		return mapper.selLocation();
	}
	
	public List<ApartmentInfoDomain> getData(ApartmentInfoEntity p) {
		final String serviceKey = "Y2UOCkD8Ilv2gViPGV33ddNTTQfRi92i8mRzUeQX+NgSiNTO3gp9hJZX4J6u8uXucMM6RdRBoGxMn6XHfsEzNA==";
//		final String serviceKey = "Y2UOCkD8Ilv2gViPGV33ddNTTQfRi92i8mRzUeQX%2BNgSiNTO3gp9hJZX4J6u8uXucMM6RdRBoGxMn6XHfsEzNA%3D%3D";
		final String url = "http://openapi.molit.go.kr/OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcAptTradeDev";

//		String decodeServiceKey = null;

		final String lawd_cd = p.getRegional_code();
		
		String mon = "0" + p.getDeal_month();
		mon = mon.substring(mon.length() - 2);			//무조건 월은 2자리로 만들어주기위해서 이렇게 해주는거
		final String deal_ym = p.getDeal_year() + mon;
		
		final int location_cd = mapper.selCd(p);
		
		//우리 DB에 저장된 자료가 있는지 확인 (자료가 있으면 있는 자료를 리턴, 없으면 openApi 통신을 하여 자료를 가져온 뒤, DB에 저장하고 자료를 리턴)
		p.setLocation_cd(location_cd);
		List<ApartmentInfoDomain> dbList = mapper.selApart(p);
		if(dbList.size() != 0) {
			return dbList;
		}
		
//		try {
//			decodeServiceKey = URLDecoder.decode(serviceKey, "UTF-8");
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}

		final HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
		final HttpEntity entity = new HttpEntity(headers);
		UriComponents builder = UriComponentsBuilder.fromHttpUrl(url)
								.queryParam("LAWD_CD", lawd_cd)
								.queryParam("DEAL_YMD", deal_ym)
								.queryParam("serviceKey", serviceKey)
								.build(false);
		
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
		
		ResponseEntity respEntity = restTemplate.exchange(builder.toUriString(), HttpMethod.GET, entity, String.class);

		String result = (String)respEntity.getBody();
		
		ObjectMapper om = new XmlMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		ResponseDomain domain = null;
		
		try {
			domain = om.readValue(result, ResponseDomain.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		List<ApartmentInfoDomain> list = domain.getBody().getItems();
		if(list != null && list.size() > 0) {
			mapper.insApart(new ApartmentInfoDTO(location_cd, list));
		}
		
		return mapper.selApart(p);
	}
}
