package com.perfromantapps.employmentmanager.repositories;

import com.perfromantapps.employmentmanager.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDataService extends CrudRepository<Employee, Integer> {


}
