package com.omkbron.spring.jms.example.model;

import java.io.Serializable;

public class Confirmation implements Serializable {
	private Integer id;
	private String response;

	public Confirmation(Integer id, String response) {
		super();
		this.id = id;
		this.response = response;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Confirmation [id=");
		builder.append(id);
		builder.append(", response=");
		builder.append(response);
		builder.append("]");
		return builder.toString();
	}

}
