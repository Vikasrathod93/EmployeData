package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employe;
import com.example.demo.Service.EmployeService;


@RestController
public class EmployeController {
	
	EmployeService empService;

	public EmployeController(EmployeService empService) {
		super();
		this.empService = empService;
	}
	
	@PostMapping("/create")
	public String create(@RequestBody Employe em) {
	empService.createEmploye(em);
	return "created";
	}
	
	@GetMapping("/get/{empid}")
	public Employe get(@PathVariable int empid) {
		return empService.getEmploye(empid);	
	}
	
	@GetMapping("/getAll")
	public List<Employe> getAll() {
		return empService.getAllEmploye();
	}
	
	@PutMapping("/update/{empid}")
	public String updat( @PathVariable int empid, @RequestBody Employe em) {
		em.setEmpid(empid);
		empService.updateEmploye(em);
		return "Updated";
		
		
	}
	
	@DeleteMapping("/delete/{empid}")
	public String delete(@PathVariable int empid ) {
		empService.deleteEmploye(empid);
		return "deleted";
		
		
	}
	

}
