package com.madushan.training.salesmanager.service;

import java.util.List;



import com.madushan.training.salesmanager.model.Employee;
import com.madushan.training.salesmanager.repository.EmployeeRepository;
import com.madushan.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;


@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	//EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
	
	EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(){
		//To auto - genarated constractor stub
	}

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository
	}

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter injectin Fired");
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.getAllEmployees();
	}
	

}
