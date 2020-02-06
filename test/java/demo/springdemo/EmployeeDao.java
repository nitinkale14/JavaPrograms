package demo.springdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

    @Autowired
    EmployeeStorage empStorage;

    public List<Employee> getEmployees() {

        return empStorage.getEmployeeList();
    }

    public void addEmployee(Employee e) {

        empStorage.addEmpToList(e);
    }
    
    }
