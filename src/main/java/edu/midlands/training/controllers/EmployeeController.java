package edu.midlands.training.controllers;


import edu.midlands.training.entities.Employee;
import edu.midlands.training.services.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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


  @GetMapping("/employees/{id}") public Employee getEmpolyeeByID(@PathVariable int id) {
    return employeeService.getEmployeeById(id);
  }

  @GetMapping("/employees?isActive={status}")
  public List<Employee> getActiveEmployees(@PathVariable boolean activeStatus){
    return employeeService.getActiveEmployees(activeStatus);
  }

  @PostMapping("/employees")
  public Employee addEmployee(@RequestBody Employee employee){
    return employeeService.addEmployee(employee);
  }

  @PutMapping("/employees/{id}")
  public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee){
    return employeeService.updateEmployee(id,employee);
  }

}
