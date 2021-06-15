package com.steve.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.steve.spring.springjdbc.employee.dao.EmployeeDao;
import com.steve.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.steve.spring.springjdbc.employee.entity.Employee;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		return jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname=?,lastName=? where id = ?";
		return jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
	}

	@Override
	public int delete(Employee employee) {
		String sql = "delete from employee where id=?";
		return jdbcTemplate.update(sql, employee.getId());
	}

	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id=?";
		EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
		return jdbcTemplate.queryForObject(sql, employeeRowMapper,id);
	}
	
	@Override
	public List<Employee> read() {
		String sql = "select * from employee";
		EmployeeRowMapper employeeRowMapper =  new EmployeeRowMapper();
		List<Employee> result = jdbcTemplate.query(sql, employeeRowMapper);
		return result;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
