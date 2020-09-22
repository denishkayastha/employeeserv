package com.employee.serv.restserviceimpl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.employee.serv.model.Address;
import com.employee.serv.model.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeResourceImplTest {



	 @Autowired
	    private TestRestTemplate restTemplate;
	 
	 
	 @Test
	 public void testGetEmployeebyID_200() {
		 ResponseEntity<Employee> entity = this.restTemplate.getForEntity("/v1/bfs/employees/1",
	                Employee.class);
		 assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
	 }
	 
	 @Test
	 public void testGetEmployeebyID_404() {
		 ResponseEntity<Employee> entity = this.restTemplate.getForEntity("/v1/bfs/employees/a",
	                Employee.class);
		 assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
	 }
	 
	 @Test
	 public void testcreateEmployee_200() {
		 Employee emp = new Employee();
		 emp.setId(1);
		 emp.setName("Sam");
		 emp.setAddress(setAddressDetails());
		 this.restTemplate.put("/v1/bfs/createemployee", emp);
		 
	 }

	private Address setAddressDetails() {
		Address address = new Address();
		address.setLine1("New line");
		address.setCity("test city");
		address.setState("State");
		address.setCountry("US");
		address.setZipcode("12345");
		return address;
	}
}
