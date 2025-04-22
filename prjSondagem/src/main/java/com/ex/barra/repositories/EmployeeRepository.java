package com.ex.barra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.barra.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
