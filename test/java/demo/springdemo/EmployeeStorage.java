package demo.springdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeStorage {
	
	List<Employee> emp = new ArrayList<Employee>();
	
	public List<Employee> getEmployeeList() {
		return emp;
	}
	
	public void addEmpToList(Employee e) {
		emp.add(e);
	}
}
