package com.ead.course.repositories;

import com.ead.course.models.LessonModule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LessonRepository extends JpaRepository<LessonModule, UUID> {
}
