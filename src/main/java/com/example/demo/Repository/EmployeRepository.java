package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Integer>{

}
