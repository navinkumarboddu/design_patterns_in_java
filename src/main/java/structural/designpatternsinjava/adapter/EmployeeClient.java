package structural.designpatternsinjava.adapter;

import structural.designpatternsinjava.adapter.Employee;
import structural.designpatternsinjava.adapter.EmployeeDB;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
	
		List<Employee> employees = new ArrayList<>();
		
		Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
		
		employees.add(employeeFromDB);
		
		//Will not work! This is where the adapter comes into play!

		//Employee employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");

		EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");

		employees.add(new EmployeeAdapterLdap(employeeFromLdap));

		EmployeeCSV employeeCSV = new EmployeeCSV("567,Solo,Han,han@solo.com");

		employees.add(new EmployeeAdapterCSV(employeeCSV));

		return employees;
		
	}
	
}