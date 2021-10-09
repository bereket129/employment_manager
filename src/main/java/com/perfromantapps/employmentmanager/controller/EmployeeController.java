package com.perfromantapps.employmentmanager.controller;

import com.perfromantapps.employmentmanager.model.Employee;
import com.perfromantapps.employmentmanager.repositories.EmployeeDataService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDataService employeeDataService;


    @GetMapping("/employees")
    public List<Employee> getAllEmployees(Response res){
        ArrayList<Employee> arrayList = new ArrayList<>();
       employeeDataService.findAll().forEach(arrayList::add);
       return arrayList;

    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);
        return employeeDataService.save(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeDataService.save(employee);
    }

    @DeleteMapping("/employees")
    public String deleteEmployee(@RequestBody Employee employee){
        try{
            employeeDataService.delete(employee);
        }catch (Exception e){
            return "Deleting employee was not successful";
        }
        return "Deleting employee was successful";
    }


}
