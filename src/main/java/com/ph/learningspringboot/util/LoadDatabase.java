package com.ph.learningspringboot.util;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ph.learningspringboot.model.Chapter;
import com.ph.learningspringboot.repository.ChapterRepository;

import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {

	@Bean
	CommandLineRunner init (ChapterRepository repository) {
		return args -> {
			Flux.just(
				new Chapter("Quick Start with Java"),
				new Chapter("Reactive Web with Spring Boot"),
				new Chapter("...and more!"))
				.flatMap(repository::save)
				.subscribe(System.out::println);
		};
	}
}
