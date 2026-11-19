package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employe;
import com.example.demo.Repository.EmployeRepository;


@Service
public class EmployeService {
	
	@Autowired
	EmployeRepository  employerepo;
	
	
	
	public EmployeService(EmployeRepository employerepo) {
		this.employerepo = employerepo;
	}



	public Employe createEmploye(Employe em) {
		return employerepo.save(em);
	}
	
	public Employe getEmploye(int empid) {
		return employerepo.findById(empid).orElse(null);
		
	}
	
	public List<Employe> getAllEmploye() {
		 List<Employe> EmployeList = employerepo.findAll();
		 return EmployeList;
	}
	
	public void updateEmploye(Employe em) {
		employerepo.save(em);
		
	}
	public void deleteEmploye(int empid) {
		 employerepo.deleteById(empid);
		
	}
	

}
