package com.example.SpringBoot_DB2_with_Angular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBoot_DB2_with_Angular.entites.Student;

@Repository
public interface StudRepo extends JpaRepository<Student, Integer>{

}
