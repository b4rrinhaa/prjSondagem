package com.ex.barra.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.barra.entities.Employee;
import com.ex.barra.repositories.EmployeeRepository;

@Service
public class EmployeeService {

private final EmployeeRepository employeeRepository;
   
   @Autowired
   public EmployeeService(EmployeeRepository employeeRepository) {
       this.employeeRepository = employeeRepository;
   }
   
   public Employee findProjectById(Long id) {
       Optional<Employee> employee = employeeRepository.findById(id);
               return employee.orElse(null);
   }
   
   public List<Employee> findAllEmployees(){
       return employeeRepository.findAll();
   }
   
   public Employee saveEmployee(Employee employee) {
       return employeeRepository.save(employee);
   }

public Employee findEmployeeById(Long id) {
	// TODO Auto-generated method stub
	return null;
}
}