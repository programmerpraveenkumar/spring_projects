package springrest;

import java.util.List;

import org.springframework.stereotype.Service;

public interface EmployeeService {
	public List<Employee> getEmployees();
	 public Employee getEmployee(Long employeeId);
	 public int deleteEmployee(Long employeeId); 
	 public int updateEmployee(Employee employee);
	 public int createEmployee(Employee employee); 
}
