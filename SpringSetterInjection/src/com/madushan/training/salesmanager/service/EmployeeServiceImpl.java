package com.madushan.training.salesmanager.service;

import java.util.List;



import com.madushan.training.salesmanager.model.Employee;
import com.madushan.training.salesmanager.repository.EmployeeRepository;
import com.madushan.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;


@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	//EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}



	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}



	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.getAllEmployees();
	}
	

}
