package Interfaces;
import java.lang.*;
import Classes.Employee;
/* GROUP- 3
SEC E 
LAB PROJECT*/

public interface FillingStationEmployeeOperations
{
	boolean insertEmployee(Employee e);
	boolean removeEmployee(Employee e);
	Employee searchEmployee(String empId);
	void showAllEmployees();
}