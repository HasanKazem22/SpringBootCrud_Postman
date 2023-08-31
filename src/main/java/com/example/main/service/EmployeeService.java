package com.example.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.model.EmployeeModel;
import com.example.main.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepo;
	
	
//	Create Employee Data
	public EmployeeModel saveEmployee(EmployeeModel employeeModel) {
		return employeeRepo.save(employeeModel);
	}
	
	
//	Read All Employee Data
	public List<EmployeeModel> readallEmployee() {
		return employeeRepo.findAll();
	}
	
	
//	Read Employee Data
	public EmployeeModel readEmployee(int id) {
		return employeeRepo.findById(id).orElse(null);
	}
	
	
//	Update Employee Data
	public EmployeeModel updateEmployee(EmployeeModel employeeModel) {
		EmployeeModel eu = employeeRepo.findById(employeeModel.getId()).orElse(null);
		eu.setName(employeeModel.getName());
		eu.setDesig(employeeModel.getDesig());
		eu.setAddress(employeeModel.getAddress());
		
		return employeeRepo.save(eu);
	}
	
	
//	Delete Employee Data
	public String deleteEmployee(int id) {
		employeeRepo.deleteById(id);
		return "Your Data Is Deleted Successfully!!!";
	}
}
