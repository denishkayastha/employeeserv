package com.employee.serv.config;

import javax.annotation.PostConstruct;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.employee.serv.restserviceimpl.EmployeeResourceImpl;

@Component
@Configuration
public class EmpJerseyConfig extends ResourceConfig {
  @PostConstruct
  public void init() {
    configEndPoints();
  }
 
  private void configEndPoints(){    
    register(EmployeeResourceImpl.class);

  }
}