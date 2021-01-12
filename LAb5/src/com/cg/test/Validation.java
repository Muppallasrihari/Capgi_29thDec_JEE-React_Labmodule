package com.cg.test;


import com.cg.eis.exception.EmployeeException;
import com.cg.eis.exception.InvalidAgeException;
import com.cg.eis.exception.InvalidNameException;

public class Validation {

	
	static void validateAge(int age) throws InvalidAgeException{
		if(age<15)
		{
			throw new InvalidAgeException("Invalid Age");
		}
		else
		{
			System.out.println("Valid Age");
		}
	}
	static void validateName(String fname,String lname) throws InvalidNameException{
		if(fname.isEmpty() ||  lname.isEmpty())
		{
			throw new InvalidNameException ("Invalid Name");
		}
		else
		{
				System.out.println("Valid Name");
		}
	}

	static void validateSalary(int salary) throws EmployeeException
	{
		if(salary < 3000)
		{
			throw new EmployeeException ("Cant be less than 3000");
		}
		else
		{
			System.out.println("Valid salary");
		}
	}
	public static void main(String[] args) throws EmployeeException {
		
		try {
			validateAge(18);
			validateName("sri","Anu");
			validateSalary(1000);
		} 
		catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		} 
		catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		}
		catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	

}
