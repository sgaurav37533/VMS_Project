package com.Students.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Students.app.rest.Models.StudentData;

public interface UserRepo extends JpaRepository<StudentData, Long> {

}
