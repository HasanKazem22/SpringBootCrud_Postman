package com.example.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.model.EmployeeModel;
import com.example.main.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	
//	Create Data Api
	@PostMapping("/create")
	public EmployeeModel saveEmployee(@RequestBody EmployeeModel employeeModel) {
		return employeeService.saveEmployee(employeeModel);
	}
	
	
//	Read All Data Api
	@GetMapping("/readall")
	public List<EmployeeModel> readallEmployee() {
		return employeeService.readallEmployee();
	}
	
	
//	Read Data Api
	@GetMapping("/read/{id}")
	public EmployeeModel readEmployee(@PathVariable int id) {
		return employeeService.readEmployee(id);
	}
	
	
//	Update Data Api
	@PutMapping("/update")
	public EmployeeModel updateEmployee(@RequestBody EmployeeModel employeeModel) {
		return employeeService.updateEmployee(employeeModel);
	}
	
	
//	Delete Data Api
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmployee(id);
	}
}
