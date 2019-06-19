package com.lambdaschool.schooldeploy.services;

import com.lambdaschool.schooldeploy.model.Course;
import com.lambdaschool.schooldeploy.view.CountStudentsInCourses;

import java.util.ArrayList;

public interface CourseService
{
    ArrayList<Course> findAll();

    ArrayList<CountStudentsInCourses> getCountStudentsInCourse();

    void delete(long id);
}
