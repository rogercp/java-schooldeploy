package com.lambdaschool.schooldeploy.repository;

import com.lambdaschool.schooldeploy.model.Student;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface StudentRepository extends PagingAndSortingRepository<Student,Long>
{
    List<Student> findByStudnameContainingIgnoreCase(String name, Pageable pageable);
}
