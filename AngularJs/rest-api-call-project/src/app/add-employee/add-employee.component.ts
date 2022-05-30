import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { EmployeesService } from '../employees.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

  constructor(private employeeService:EmployeesService) { }
  status:string="";
  ngOnInit(): void {
  }

  saveEmployee(formData:NgForm){

    console.log(formData.value);

    this.employeeService.saveEmployee(formData.value)
      .subscribe(data => {
        console.log(data)
        if(data!=null)
        this.status="Employee Added";
      })     
    
  }
}
