package Classes;
import java.lang.*;
/* GROUP- 3
SEC E 
LAB PROJECT*/

public class Employee
{
	private String empId;
	private String name;
	private double salary;
	
	public void setEmpId(String empId)
	{
		this.empId = empId;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public String getEmpId()
	{
		return empId;
		
	} 
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	
	void showDetails()
	{
		        System.out.println("Employee Id: " + empId);
				System.out.println("Employee Name: " + name);
				System.out.println("Employee Salary: " + salary);
				System.out.println();
	}
	
	           
}