import { Component, Input, OnInit } from '@angular/core';
import { Employee } from '../Employee.model';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  @Input("employee")
  employeeObj:Employee=new Employee();
  
  employee:any;
  constructor() { }

  ngOnInit(): void {
    this.employee={
      id:this.employeeObj.id,
      name:this.employeeObj.name,
      designation:this.employeeObj.designation,
      department:this.employeeObj.department,
      salary:this.employeeObj.salary
    }
  }

}
