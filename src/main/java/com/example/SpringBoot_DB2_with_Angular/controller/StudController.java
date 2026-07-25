package com.example.SpringBoot_DB2_with_Angular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot_DB2_with_Angular.entites.Student;
import com.example.SpringBoot_DB2_with_Angular.service.StudService;

@RestController
public class StudController {

    @Autowired
    StudService ssr;

    @PostMapping("/savestud")
    public void saveStudent(@RequestBody Student st) {
        ssr.saveStud(st);
    }

    @GetMapping("/view")
    public List<Student> getAllData() {
        return ssr.getAllStud();
    }

    @GetMapping("/getid/{id}")
    public Student getStudById(@PathVariable int id) {
        return ssr.getByid(id);
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        ssr.deletByid(id);
    }

    @PutMapping("/update")
    public void updateStud(@RequestBody Student st) {
        ssr.saveStud(st);
    }
}
