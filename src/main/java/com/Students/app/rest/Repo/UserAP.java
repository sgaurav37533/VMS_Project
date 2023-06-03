package com.Students.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Students.app.rest.Models.Appointment;

public interface UserAP extends JpaRepository<Appointment, Long> {

}
