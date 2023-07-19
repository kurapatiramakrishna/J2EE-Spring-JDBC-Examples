package com.jsp1.springJdbcProgram;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp1.Model.Employee;
import com.jsp1.springJdbc.Config.EmployeeConfiguratin;
import com.jsp1.springJdbc.Dao.EmployeeDao;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfiguratin.class);
		EmployeeDao dao = context.getBean(EmployeeDao.class);
		Employee employee = context.getBean(Employee.class);

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the employee ID: ");
		int eid = scan.nextInt();

		System.out.print("Enter the employee name: ");
		String ename = scan.next();

		System.out.print("Enter the employee salary: ");
		int esalary = scan.nextInt();

		System.out.print("Enter the employee email: ");
		String email = scan.next();

		System.out.print("Enter the employee mobile number: ");
		int emobileno = scan.nextInt();

		System.out.print("Enter the employee password: ");
		String password = scan.next();

		System.out.print("Enter the employee department number: ");
		int edeptno = scan.nextInt();

		Employee employee1 = new Employee(); // Create the Employee object
		employee1.setEid(eid);
		employee1.setEname(ename);
		employee1.setEsalary(esalary);
		employee1.setEmail(email);
		employee1.setEmobileno(emobileno);
		employee1.setPassword(password);

		// Set the department number to the employee only if it is provided
		if (edeptno != 0) {
			employee1.setEdeptno(edeptno);
		}

		dao.insert(employee1);
	}
}
