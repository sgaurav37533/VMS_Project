package com.Students.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Students.app.rest.Models.Details;

public interface UserDT extends JpaRepository<Details, Long> {

}
