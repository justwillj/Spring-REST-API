package edu.midlands.training.controllers;


import edu.midlands.training.entities.Employee;
import edu.midlands.training.services.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/employees")
  public List<Employee> getEmployees(){
    return employeeService.getEmployee();
  }

  @PostMapping("/employees")
  public Employee addEmployee(@RequestBody Employee employee){
    return employeeService.addEmployee(employee);
  }

}
