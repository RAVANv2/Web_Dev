package com.course.repositories;

import com.course.model.YoutubeCourse;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RepoYoutubeCourse extends CrudRepository<YoutubeCourse, Integer> {
    public Optional<YoutubeCourse> findById(Integer id);
}
