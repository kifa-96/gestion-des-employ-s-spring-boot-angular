package com.employeemanagement.employeemanagement.service;

import com.employeemanagement.employeemanagement.model.Employee;
import com.employeemanagement.employeemanagement.repository.EmployeeRepository;
//import com.mananger.employeemanager.Exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployees(Employee employee){
        employee.setCodeemployee(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee updateEmployees(Employee employee ){
        return employeeRepository.save(employee);
    }

    public void deleteEmployees(Long id){
        employeeRepository.deleteById(id);
    }

    public Employee findEmployeeBiId(Long id){
        return employeeRepository.findEmployeeById(id).get();
    }


}
