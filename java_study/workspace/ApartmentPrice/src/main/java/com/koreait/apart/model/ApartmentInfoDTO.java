package com.koreait.apart.model;

import java.util.List;

public class ApartmentInfoDTO {
	public int location_cd;
	private List<ApartmentInfoDomain> list;
	
	public ApartmentInfoDTO(int location_cd, List<ApartmentInfoDomain> list) {
		super();
		this.location_cd = location_cd;
		this.list = list;
	}

	public int getLocation_cd() {
		return location_cd;
	}

	public List<ApartmentInfoDomain> getList() {
		return list;
	}
	
}
