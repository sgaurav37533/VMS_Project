package com.Students.app.rest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Students.app.rest.Models.AppliedStudents;
import com.Students.app.rest.Models.Opportunity;
import com.Students.app.rest.Models.StudentData;
import java.util.List;
import com.Students.app.rest.Repo.*;

@RestController
public class ApiController {

    @Autowired(required = true)
    private UserRepo userRepo;

    @Autowired(required = true)
    private UserOp userOP;

    @Autowired(required = true)
    private UserAS userAS;

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome";
    }

    @GetMapping(value = "/getAppliedStudents")
    public List<AppliedStudents> getAppliedStudents() {
        return userAS.findAll();
    }

    @PostMapping(value = "/postAppliedStudents")
    public void saveAppliedStudents(@RequestBody AppliedStudents as) {
        userAS.save(as);
    }

    @GetMapping(value = "/getOpportunity")
    public List<Opportunity> getOpportunity() {
        return userOP.findAll();
    }

    @PostMapping(value = "/postOpportunity")
    public void saveOpportunity(@RequestBody Opportunity op) {
        userOP.save(op);
    }

    @GetMapping(value = "/getStudent")
    public List<StudentData> getStudentData() {
        return userRepo.findAll();
    }

    @PostMapping(value = "/postStudent")
    public void saveStudent(@RequestBody StudentData studen) {
        userRepo.save(studen);
    }

}
