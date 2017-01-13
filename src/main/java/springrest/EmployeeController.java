package springrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	 private EmployeeService employeeService;

	 @RequestMapping(value = "/employee", method = RequestMethod.GET, produces = "application/json")
	 public ResponseEntity<List<Employee>> employees() {

	  HttpHeaders headers = new HttpHeaders();
	  List<Employee> employees = employeeService.getEmployees();

	  if (employees == null) {
	   return new ResponseEntity<List<Employee>>(HttpStatus.NOT_FOUND);
	  }
	  headers.add("Number Of Records Found", String.valueOf(employees.size()));
	  return new ResponseEntity<List<Employee>>(employees, headers, HttpStatus.OK);
	 }	
}
