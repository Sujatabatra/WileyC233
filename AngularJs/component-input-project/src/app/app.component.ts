import { Component, OnInit } from '@angular/core';
import { Employee } from './Employee.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent{
  
  employee:Employee=new Employee();
  
  title = 'component-input-project';

  constructor(){
    this.employee.id="E001";
    this.employee.name="AAAA";
    this.employee.designation="Executive";
    this.employee.department="IT";
    this.employee.salary=25000;
  }
  
}
