import { Component, NgZone, OnInit } from '@angular/core';
import { EmployeesService } from '../employees.service';

@Component({
  selector: 'app-employeelist',
  templateUrl: './employeelist.component.html',
  styleUrls: ['./employeelist.component.css']
})
export class EmployeelistComponent implements OnInit {

  employeelist:any;

  constructor(private zone: NgZone,private employeeService:EmployeesService) { }

  ngOnInit(): void {
  }

  getEmployeeList(){
    let obs=this.employeeService.getEmployeeList();
    obs.subscribe(response=>{
      console.log(response);
      this.zone.run(()=>{
        this.employeelist=response;
        console.log(this.employeelist);
      });
    })
  }

}
