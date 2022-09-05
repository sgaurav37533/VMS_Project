package com.Students.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Students.app.rest.Models.AppliedStudents;

public interface UserAS extends JpaRepository<AppliedStudents, Long> {

}
