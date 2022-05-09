package com.sujata.service;

import java.util.List;
import java.util.Optional;

import com.sujata.entity.Employee;
import com.sujata.entity.PaySlip;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

//	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	private EmployeeDao employeeDao;
	
	
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
	super();
	this.employeeDao = employeeDao;
}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllRecords();
	}

	@Override
	public Optional<Employee> searchEmployeeById(int empId) {
		return employeeDao.getRecordById(empId);
	}

	@Override
	public Optional<PaySlip> generateEmployeePaySlip(int empId) {
		Optional<Employee> optionalEmployee=employeeDao.getRecordById(empId);
		PaySlip payslip=null;
		if(optionalEmployee.isPresent()) {
			Employee employee=optionalEmployee.get();
			payslip=new PaySlip();
			payslip.setEmployee(employee);
			payslip.setHr(employee.getEmpSalary()*.15);
			payslip.setDa(employee.getEmpSalary()*.18);
			payslip.setPf(employee.getEmpSalary()*.12);
			payslip.setTotalSalary(employee.getEmpSalary()+payslip.getHr()+payslip.getDa()-payslip.getPf());
		}
		return Optional.ofNullable(payslip);
	}

	@Override
	public boolean deleteEmployeeById(int id) {
		if(employeeDao.deleteRecordById(id)>0)
			return true;
		return false;
	}

	@Override
	public boolean incrementSalary(int id, int salary) {
		if(employeeDao.incrementSalaryById(id, salary)>0)
			return true;
		return false;
	}

}
