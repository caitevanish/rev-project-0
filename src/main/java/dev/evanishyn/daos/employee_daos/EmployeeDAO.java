package dev.evanishyn.daos.employee_daos;

import dev.evanishyn.entities.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeDAO {

    //post
    Employee createEmployee(Employee employee);

    //get
    Employee getEmployeeById(int id);

    List<Employee> getEmployeeList();
//    Map<Integer, Employee> getEmployeeList();

    //put
    Employee updateEmployeeInfo(Employee employee);

    //delete
    boolean deleteEmployee(int id);

}