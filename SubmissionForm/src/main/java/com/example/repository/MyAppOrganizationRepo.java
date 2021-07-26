package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Organization;

@Repository
public interface MyAppOrganizationRepo extends JpaRepository<Organization, Long>{

}
