package com.employee.serv.restservice;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.serv.model.Employee;

@Path("/v1/bfs")
@RestController
public interface EmployeeResource {

	@Path("/employees/{id}")
	@GET
	@Produces("application/json")
	public ResponseEntity<Employee> getEmployeeByID(@PathParam(value = "id") @NotNull int id);
	
	@Path("/createemployee")
	@PUT
	@Produces("application/json")
	@Consumes("application/json")
	public ResponseEntity<String> createEmployee(@Valid @RequestBody Employee employee);
}
