package com.employee.serv.restserviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.employee.serv.model.Employee;
import com.employee.serv.repository.EmployeeRepository;
import com.employee.serv.restservice.EmployeeResource;

@Component
public class EmployeeResourceImpl implements EmployeeResource {

	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public ResponseEntity<Employee> getEmployeeByID(int id) {
		System.out.println("ID is :" +id);
		
		Optional<Employee> emp = repository.findById(id);
		return ResponseEntity.of(emp); 
	}

	@Override
	public ResponseEntity<String> createEmployee(Employee employee) {
		repository.save(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body("Success");
	}

}
