package springrest;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao  {
	private JdbcTemplate jdbcTemplate;
	 @Autowired
	 public void setDataSource(DataSource dataSource) {
	  this.jdbcTemplate = new JdbcTemplate(dataSource);
	 }
	 
	public List<Employee> getEmployees() {
		 List<Employee> employees = null ;
		  
		  try {
		   employees = jdbcTemplate.query("SELECT * FROM employee",new BeanPropertyRowMapper<Employee>(Employee.class));   
		  } catch (DataAccessException e) {
		   e.printStackTrace();
		  }
		  return employees;
	}

	public Employee getEmployee(Long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteEmployee(Long employeeId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

}
