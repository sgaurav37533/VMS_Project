package com.Students.app.rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Students.app.rest.Models.Appointment;
import com.Students.app.rest.Models.Details;
import com.Students.app.rest.Repo.UserAP;
import com.Students.app.rest.Repo.UserDT;

@RestController
public class ApiController {

    @Autowired(required = true)
    private UserDT userOP;

    @Autowired(required = true)
    private UserAP userAS;

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome";
    }

    @GetMapping(value = "/getAppointment")
    public List<Appointment> getAppliedStudents() {
        return userAS.findAll();
    }

    @PostMapping(value = "/postAppointment")
    public void saveAppliedStudents(@RequestBody Appointment as) {
        userAS.save(as);
    }

    @GetMapping(value = "/getDetails")
    public List<Details> getOpportunity() {
        return userOP.findAll();
    }

    @PostMapping(value = "/postDetails")
    public void saveOpportunity(@RequestBody Details op) {
        userOP.save(op);
    }

}
