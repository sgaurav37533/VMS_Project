package com.Students.app.rest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Students.app.rest.Models.StudentData;
import java.util.List;
import com.Students.app.rest.Repo.UserRepo;

@RestController
public class ApiController {

    @Autowired(required = true)
    private UserRepo userRepo;

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome";
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
