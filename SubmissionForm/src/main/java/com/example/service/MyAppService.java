package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.*;
import com.example.exception.EmptyInputException;
import com.example.repository.MyAppAssertsRepo;
import com.example.repository.MyAppEmployeeRepo;
import com.example.repository.MyAppOrganizationRepo;

@Service
public class MyAppService {
	
	
	 @Autowired 
	 MyAppOrganizationRepo orgrepo;
	 
	 @Autowired 
	 MyAppEmployeeRepo empRepo;
	 
	 @Autowired 
	 MyAppAssertsRepo assertRepo;
		
		public Organization getOrgById(int id) {
			 Optional<Organization> orgResponse = orgrepo.findById((long)id);
			  Organization org=orgResponse.get();
			  System.out.println("Hey hello coming here>>>");
			  return org;
		}

		public Organization postOrganization(Organization org) {
			// TODO Auto-generated method stub
			Organization e=orgrepo.save(org);
			return e;
		}
		
		public Organization putOrganization(Organization org) {
			// TODO Auto-generated method stub
			Organization e=orgrepo.save(org);
			return e;
		}
				
		public int dropOrganization(int id) {
			// TODO Auto-generated method stub
			orgrepo.deleteById((long) id);
			return id;
		}
		
		public Employee getEmpById(int id) {
			 Optional<Employee> empResponse = empRepo.findById((long)id);
			 Employee emp=empResponse.get();
			  System.out.println("Hey employee coming here>>>");
			  return emp;
		}
	 
		
		public Employee postEmployee(Employee emp) {
			// TODO Auto-generated method stub
			if (emp.getEmpName().length() ==0)
			{
				throw new EmptyInputException("EMP-NAME","Name cannot be empty");
	
			}
			Employee e=empRepo.save(emp);
			return e;
		}

		public Employee putEmployee(Employee emp) {
			// TODO Auto-generated method stub
			Employee e=empRepo.save(emp);
			return e;
		}
		
		public int dropEmployee(int id) {
			// TODO Auto-generated method stub
			empRepo.deleteById((long) id);
			return id;
		}
		
		public Asserts getAssertById(int id) {
			 Optional<Asserts> assertResponse = assertRepo.findById((long)id);
			 Asserts aseert=assertResponse.get();
			  System.out.println("Hey assertRepo coming here>>>");
			  return aseert;
		}
	 
		
		public Asserts postAssert(Asserts assert1) {
			// TODO Auto-generated method stub
			if (assert1.getAssertName().length() ==0)
			{
				throw new EmptyInputException("ASSERT-NAME","Name cannot be empty");
	
			}
			Asserts a= assertRepo.save(assert1);
			return a;
		}

		public Asserts putAssert(Asserts assert1) {
			// TODO Auto-generated method stub
			Asserts a= assertRepo.save(assert1);
			return a;
		}
		
		public int dropAssert(int id) {
			// TODO Auto-generated method stub
			assertRepo.deleteById((long) id);
			return id;
		}
		
}
