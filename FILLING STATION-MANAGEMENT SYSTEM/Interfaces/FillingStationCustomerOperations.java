package Interfaces;
import java.lang.*;
import Classes.Customer;

import java.lang.*;


public interface FillingStationCustomerOperations
{
	boolean insertCustomer(Customer c);
	boolean removeCustomer(Customer c);
	Customer searchCustomer(String TranNo);
	void showAllCustomers();
}




