package com.koreait.apart.model;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="body")
public class BodyDomain {
	
	@JacksonXmlProperty(localName="items")
	private List<ApartmentInfoDomain> items;

	public List<ApartmentInfoDomain> getItems() {
		return items;
	}

	public void setItems(List<ApartmentInfoDomain> items) {
		this.items = items;
	}
}
