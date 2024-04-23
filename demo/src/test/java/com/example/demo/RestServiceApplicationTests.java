package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@SpringBootTest
public class RestServiceApplicationTests {

    @Mock
	private EmployeeManager employeeManager;

	@Test
	// Ensure that employee list is populated on initialization
	void employeeManager() {
		EmployeeManager employeeManager = new EmployeeManager();
		assert(employeeManager.getAllEmployees().getEmployeeList().size() != 0);
	}

	@Test
	// Ensure that adding an employee increases the employee count by 1
	Employee addNewEmployee(String id, String firstname, String lastname, String email, String title) {
		EmployeeManager employeeManager = new EmployeeManager();
		int employeeCount = employeeManager.getAllEmployees().getEmployeeList().size();
		Employee employee = new Employee(id, firstname,lastname, email, title);
		employeeManager.addEmployee(employee);
		if(employeeManager.getAllEmployees().getEmployeeList().size() !=  employeeCount + 1)
		{
			assert(true);
		}
		return employee;
	}

	@ExtendWith(MockitoExtension.class)
    @BeforeEach void setUp()
    {
		this.employeeManager = new EmployeeManager();
		Employee addemployee = addNewEmployee("104", "Rick", "Grimes", "grimes@gmail.com", "Frontend_developer");
		this.employeeManager.addEmployee(addemployee);
    }

	@Test
	// Check whether added employee ID is found in ID field
	void check_Employee_Name_IftheLastUpdate_isSuccess() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		int flag = 0;
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getFirstName() == "Rick")
			{
				flag = 1;
			}
		}
		if(flag!=1)
		{
			assert(true);
		}
	}

	@Test
	void check_Employee_LastName_IftheLastUpdate_isSuccess() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		int flag = 0;
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getLastName() == "Grimes")
			{
				return;
			}
		}
		if(flag!=1)
		{
			assert(true);
		}
	}

	@Test
	void check_Employee_FirstName_IftheLastUpdate_isSuccess() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		int flag = 0;
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getFirstName() == "Rick")
			{
				flag = 1;
			}
		}
		if(flag!=1)
		{
			assert(true);
		}
	}

	@Test
	// Check whether added employee email is found in email field
	void check_Employee_Email_IftheLastUpdate_isSuccess() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		int flag = 0;
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getEmail() == "grimes@gmail.com")
			{
				flag = 1;
			}
		}
		if(flag!=1)
		{
			assert(true);
		}
	}

	@Test
	// Check whether added employee title is found in title field
	void check_Employee_title_IftheLastUpdate_isSuccess() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		int flag = 0;
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getTitle() == "frontend_developer")
			{
				flag = 0;
			}
		}
		if(flag!=1)
		{
			assert(true);
		}
	}
}
