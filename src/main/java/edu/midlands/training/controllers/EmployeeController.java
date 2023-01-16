package edu.midlands.training.controllers;


import edu.midlands.training.entities.Employee;
import edu.midlands.training.services.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/employees")
  public List<Employee> getEmployees(@RequestParam (value = "active",required = false) Boolean isActive){
    return employeeService.getEmployees(isActive);

  }
  @GetMapping("/employees/{id}") public Employee getEmployeeByID(@PathVariable int id) {
    return employeeService.getEmployeeById(id);
  }

  @PostMapping("/employees")
  public Employee addEmployee(@RequestBody Employee employee){
    return employeeService.addEmployee(employee);
  }

  @PutMapping("/employees/{id}")
  public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee){
    return employeeService.updateEmployee(id,employee);
  }

  @DeleteMapping("/employees/{id}")
  public void deleteEmployee(@PathVariable Integer id){
    employeeService.deleteEmployee(id);
  }
}
