package com.ph.learningspringboot.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.ph.learningspringboot.model.Chapter;

public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String> {

}
