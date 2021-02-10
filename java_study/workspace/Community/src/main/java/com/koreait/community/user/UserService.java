package com.koreait.community.user;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.koreait.community.Const;
import com.koreait.community.SecurityUtils;
import com.koreait.community.model.UserEntity;

@Service
public class UserService {

	@Autowired
	private UserMapper mapper;
	
	@Autowired
	private SecurityUtils sUtils;
	
	public int insUser(UserEntity p) {
		if(p.getUserId() == null || p.getUserId().length() < 2 || chkId(p)==1) {
			return 0;
		}
		
		//비밀번호 암호화 하는 부분
		String salt = sUtils.getSalt();
		String hashPw = sUtils.getHashPw(p.getUserPw(), salt);
		p.setSalt(salt);
		p.setUserPw(hashPw);
		
		return mapper.insUser(p);
	}
	
	//1:로그인 성공, 2:아이디 없음, 3:비밀번호가 틀림
	public int login(UserEntity p, HttpSession hs) {
		UserEntity vo = mapper.selUser(p);		
		
		if(vo == null) {
			return 2;
		} else if(!sUtils.getHashPw(p.getUserPw(), vo.getSalt()).equals(vo.getUserPw())) {
			return 3;
		}
		vo.setUserPw(null);
		vo.setSalt(null);
		vo.setRegDt(null);
		vo.setProfileImg(null);
		hs.setAttribute(Const.KEY_LOGINUSER, vo);
		return 1;
	}
	
	public int chkId(UserEntity p) {
		if(mapper.selUser(p) == null) {
			return 0;
		}
		return 1;
	}
	
	public UserEntity selUser(UserEntity p) {
		return mapper.selUser(p);
	}
	
	public int uploadProfie(MultipartFile mf, HttpSession hs) {
		int userPk = sUtils.getLoginUserPk(hs);
		
		String basePath = hs.getServletContext().getRealPath("/res/img/user/" + userPk);
		File folder = new File(basePath);
		if(!folder.exists()) {
			folder.mkdirs();
		}
		System.out.println("basePath : " + basePath);
		
		String originalFileName = mf.getOriginalFilename();
		String ext = FilenameUtils.getExtension(originalFileName);
		
		System.out.println("ext : " + ext);
		
		String fileNm = UUID.randomUUID().toString() + "." + ext;
		System.out.println("fileNm : " + fileNm);
		
		try {
			byte[] fileData = mf.getBytes();
			File target = new File(basePath + "/" + fileNm);
			FileCopyUtils.copy(fileData, target);
			
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
		
		return 1;
	}
}
