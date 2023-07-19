package com.jsp1.springJdbc.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.jsp1.Model.Employee;

@Component("eid")
public class EmployeeDaoImp implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insert(Employee employee) {
		String insert = "insert into employee (eid, ename, esalary, email, password, emobileno, edeptno) values(?,?,?,?,?,?,?)";

		int num = jdbcTemplate.update(insert, employee.getEid(), employee.getEname(), employee.getEsalary(),
				employee.getEmail(), employee.getPassword(), employee.getEmobileno(), employee.getEdeptno());

		System.out.println("Number of records inserted: " + num);

		if (num != 0)
		{
			System.out.println("Record is inserted successfully");
			System.out.println();
		}
		else 
		{
			System.out.println("No records inserted");
			System.out.println();
		}
	}
}
