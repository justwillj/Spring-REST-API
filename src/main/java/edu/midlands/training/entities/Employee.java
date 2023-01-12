package edu.midlands.training.entities;

public class Employee {

  private Integer employeeId;

  private String firstName;

  private String lastName;

  private String age;

  private boolean isActive;


  public Employee() {
  }

  public Employee(Integer employeeId, String firstName, String lastName, String age,
      boolean isActive) {
    this.employeeId = employeeId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.isActive = isActive;
  }

  public Integer getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Integer employeeId) {
    this.employeeId = employeeId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "employeeId=" + employeeId +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", age='" + age + '\'' +
        ", isActive=" + isActive +
        '}';
  }
}
