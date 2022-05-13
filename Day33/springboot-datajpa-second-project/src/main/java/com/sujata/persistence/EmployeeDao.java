package com.sujata.persistence;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.sujata.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	@Transactional
	@Modifying
	@Query("update Employee set empSalary=empSalary+:inc where empId=:id")
	void updateSalary(@Param("id") int id,@Param("inc") double increment);
	
	//List<T> or Stream<T>
	@Query("from Employee where empDepartment=?1")
	List<Employee> getEmployeesByDepartment(String department);
	
//	@Transactional
//	@Modifying
//	@Query("update Employee set empSalary=empSalary+?1 where empId=?2")
//	void updateSalary(double increment,int id);
	
	//Basic Return Type
	@Query("select sum(empSalary) from Employee where empDepartment=:depart")
	Double sumSalaryByDepartmentName(@Param("depart") String department);
	
	//Object(Employee) or Optional<Employee>
	@Query("from Employee where empName=?1")
	Employee searchEmployeeByName(String name);
	
	//select distinct department from employee where designation=?
	List<String> getEmpDepartmentDistinctByEmpDesignation(String Designation);
	
	List<Employee> findEmployeeByEmpDesignation(String desig);
	
	
	List<Employee> findEmployeeTop2ByEmpDesignationOrderByEmpNameAsc(String desig);
	
	
}
