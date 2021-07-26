package com.example.controller;

import java.util.Optional;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.*;
import com.example.repository.MyAppAssertsRepo;
import com.example.repository.MyAppEmployeeRepo;
import com.example.repository.MyAppOrganizationRepo;
import com.example.service.MyAppService;

@RestController
public class MyAppController {
	
	 @Autowired 
	 MyAppService service;
	 	
		  @GetMapping("/org/{id}") 
		  @Produces(MediaType.APPLICATION_XML) 
		  public ResponseEntity<Object> getOrganization(@PathVariable("id") int id) { 
			  Organization org= service.getOrgById(id);
			  return new ResponseEntity<>(org, HttpStatus.OK);
		 }
		  
		  
		  @PostMapping("/org/create") 
		  @Produces(MediaType.APPLICATION_XML) 
		  public ResponseEntity<Object> postOrganization(@RequestBody Organization org) { 
			  Organization savedOrg = service.postOrganization(org);
			  System.out.println("Hi I'm here>>>");
			  return new ResponseEntity<>(savedOrg, HttpStatus.CREATED);
		 }
		  
		  @PutMapping("/org/put") 
		  @Produces(MediaType.APPLICATION_XML) 
		  public ResponseEntity<Object> putOrganization(@RequestBody Organization org) { 
			  Organization savedOrg = service.putOrganization(org);
			  System.out.println("Hi I'm here>>>");
			  return new ResponseEntity<>(savedOrg, HttpStatus.CREATED);
		 }
		  
		  @DeleteMapping("/org/delete/{id}") 
		  @Produces(MediaType.APPLICATION_XML) 
		  public ResponseEntity<Object> dropOrganization(@PathVariable("id") int id) { 
			  service.dropOrganization(id);
			  return new ResponseEntity<>(id, HttpStatus.OK);  
		 }
		 
		  //getting for employee>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		 
		  
		  @GetMapping("/emp/{id}") 
		  @Produces(MediaType.APPLICATION_XML) 
		  public ResponseEntity<Object> getEmployee(@PathVariable("id") int id) { 
			  Employee emp= service.getEmpById(id);
			  return new ResponseEntity<>(emp, HttpStatus.OK);
		 }
		  
		  @PostMapping("/emp/create") 
		  @Produces(MediaType.APPLICATION_XML) 
		  public ResponseEntity<Object> postEmployee(@RequestBody Employee emp) { 
			  Employee savedEmp = service.postEmployee(emp);
			  System.out.println("Hi I'm here>>>");
			  return new ResponseEntity<>(savedEmp, HttpStatus.CREATED);
		 }
		  
		  @PutMapping("/emp/put") 
		  @Produces(MediaType.APPLICATION_XML) 
		  public ResponseEntity<Object> putEmployee(@RequestBody Employee emp) { 
			  Employee savedEmp = service.putEmployee(emp);
			  System.out.println("Hi I'm here>>>");
			  return new ResponseEntity<>(savedEmp, HttpStatus.ACCEPTED);
		 }
		  
		  @DeleteMapping("/emp/delete/{id}") 
		  @Produces(MediaType.APPLICATION_XML) 
		  public ResponseEntity<Object> dropEmployee(@PathVariable("id") int id) { 
			  service.dropEmployee(id);
			  return new ResponseEntity<>(id, HttpStatus.OK);  
		 }
		  
		  //getting for asserts>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		  
		  @GetMapping("/asserts/{id}") 
		  @Produces(MediaType.APPLICATION_XML) 
		  public ResponseEntity<Object> getAsserts(@PathVariable("id") int id) { 
		 
			  Asserts asserts= service.getAssertById(id);
			  return new ResponseEntity<>(asserts, HttpStatus.OK);

		 } 
		  
		  @PostMapping("/asserts/create") 
		  @Produces(MediaType.APPLICATION_XML) 
		  public ResponseEntity<Object> postAsserts(@RequestBody Asserts asert) { 
			  Asserts asserts = service.postAssert(asert);
			  System.out.println("Hi I'm here>>>");
			  return new ResponseEntity<>(asserts, HttpStatus.CREATED);
		 }
		  
	
		  @PutMapping("/asserts/put") 
		  @Produces(MediaType.APPLICATION_XML) 
		  public ResponseEntity<Object> putAsserts(@RequestBody Asserts asert) { 
			  Asserts asserts = service.putAssert(asert);
			  System.out.println("Hi I'm here>>>");
			  return new ResponseEntity<>(asserts, HttpStatus.ACCEPTED);
		 }
		  
		  @DeleteMapping("/asserts/delete/{id}") 
		  @Produces(MediaType.APPLICATION_XML) 
		  public ResponseEntity<Object> dropAsserts(@PathVariable("id") int id) { 
				
			  service.dropAssert(id);
			  return new ResponseEntity<>(id, HttpStatus.OK);  
		 }
		 
}
