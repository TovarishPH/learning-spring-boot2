package com.ph.learningspringboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Chapter {

	@Id
	private String id;
	private String name;

	public Chapter(String name) {
		super();
		this.name = name;
	}
	
}
