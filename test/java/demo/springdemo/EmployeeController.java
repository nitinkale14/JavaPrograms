package demo.springdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

	@Autowired
EmployeeDao empDao;
//	EmployeeDao emp1 = new EmployeeDao();

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	public List<Employee> getAllEmployees() {
		System.out.println("In get Emp");
		return empDao.getEmployees();
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
//	public void addEmployee(@RequestBody Employee e) {
//
//		empDao.addEmployee(e);
//	}
	
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee e) {
		return new ResponseEntity<Employee>(e,HttpStatus.OK);
		//return new ResponseEntity<Employee>(e, HttpStatus.OK);
	}

}
