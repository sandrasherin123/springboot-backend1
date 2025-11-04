package com.example.SpringBoot_DB2_with_Angular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SpringBoot_DB2_with_Angular.entites.Student;
import com.example.SpringBoot_DB2_with_Angular.repository.StudRepo;

@Service
public class StudService {
	@Autowired
	StudRepo srepo;
	
	
	public void saveStud(Student stud) {
		srepo.save(stud);
		
	}
	
	public List<Student> getAllStud(){
		return srepo.findAll();
	}
	
	
	public Student getByid(int id) {
		return srepo.findById(id).get();
	}
	
	public void deletByid(int id) {
		srepo.deleteById(id);
	}
	
	
}
