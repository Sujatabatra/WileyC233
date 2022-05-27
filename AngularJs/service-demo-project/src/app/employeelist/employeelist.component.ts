import { Component, OnInit } from '@angular/core';
import { EmployeesService } from '../employees.service';

@Component({
  selector: 'app-employeelist',
  templateUrl: './employeelist.component.html',
  styleUrls: ['./employeelist.component.css']
})
export class EmployeelistComponent implements OnInit {

  employees:any;
  //Depedency Injection
  constructor(private empService:EmployeesService) { }

  ngOnInit(): void {
    this.employees=this.empService.getEmployees();
  }

}
