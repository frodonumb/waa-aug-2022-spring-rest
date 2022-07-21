package com.javokhir.phase2.service;

import com.javokhir.phase2.dto.CourseDto;

import java.util.List;
import java.util.UUID;

public interface CourseService {

    List<CourseDto> getCourses();

    CourseDto getById(UUID id);

    CourseDto create(CourseDto course);

    CourseDto update(CourseDto course);

    void delete(UUID id);

    List<CourseDto> getCoursesByStudentId(UUID id);
}
