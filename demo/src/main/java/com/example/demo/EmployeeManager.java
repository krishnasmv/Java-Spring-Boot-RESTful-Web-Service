package com.example.demo;
import java.util.ArrayList; 
import java.util.List; 
  
// Class to store the list of 
// all the employees in an 
// Array List 
public class EmployeeManager { 
  
    private static Employees employeeList = new Employees();

    static
    {
        Employee employee1 = new Employee("100", "John", "Evan", "John@gmail.com", "Software Engineer");
        Employee employee2 = new Employee("101", "chris", "evan", "chris@gmail.com", "Software Developer");
        Employee employee3 = new Employee("102", "robert", "paul", "paul@gmail.com", "manager");


        employeeList.getEmployeeList().add(employee1);
        employeeList.getEmployeeList().add(employee2);
        employeeList.getEmployeeList().add(employee3);
    }
  
    // Method to return the list 
    // of employees 
    public Employees getAllEmployees()
    {
        return employeeList;
    }
  
    public void addEmployee(Employee employee)
    {
        employeeList.getEmployeeList().add(employee);
    }
} 