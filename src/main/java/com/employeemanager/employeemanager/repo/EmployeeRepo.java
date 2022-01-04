package com.employeemanager.employeemanager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employeemanager.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	//void deleteEmployeeById(Long id);

	Optional<Employee> findEmployeeByid(Long id);
	
}
