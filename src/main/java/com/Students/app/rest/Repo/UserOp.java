package com.Students.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Students.app.rest.Models.Opportunity;

public interface UserOp extends JpaRepository<Opportunity, Long> {

}
