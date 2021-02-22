package com.koreait.apart.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="response")
public class ResponseDomain {
	
	@JacksonXmlProperty(localName="body")
	private BodyDomain body;

	public BodyDomain getBody() {
		return body;
	}

	public void setBody(BodyDomain body) {
		this.body = body;
	}
}
