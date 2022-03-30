package com.employeemanagement.employeemanagement;

import com.employeemanagement.employeemanagement.model.Employee;
import com.employeemanagement.employeemanagement.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeRessource {
    private final EmployeeService employeeService;

    public EmployeeRessource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployes(){
        List<Employee> employes=employeeService.findAllEmployees();
        return new ResponseEntity<>(employes, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployes(@PathVariable("id" ) Long id){
       Employee employes=employeeService.findEmployeeBiId(id);
        return new ResponseEntity<>(employes, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee employes=employeeService.addEmployees(employee);
        return new ResponseEntity<>(employes,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployees(@RequestBody Employee employee){
        Employee employes=employeeService.updateEmployees(employee);
        return new ResponseEntity<>(employes,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployees(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
