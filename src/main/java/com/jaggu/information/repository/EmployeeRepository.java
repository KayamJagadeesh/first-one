package com.jaggu.information.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaggu.information.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
