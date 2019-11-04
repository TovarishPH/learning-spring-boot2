package com.ph.learningspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ph.learningspringboot.model.Chapter;
import com.ph.learningspringboot.repository.ChapterRepository;

import reactor.core.publisher.Flux;

@RestController
public class ChapterController {

	private ChapterRepository repository;
	
	public ChapterController(ChapterRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/chapters")
	public Flux<Chapter> listing() {
		return repository.findAll();
	}
}
