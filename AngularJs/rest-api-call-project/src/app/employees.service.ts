import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './Employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeesService {

  baseUrl:string="http://localhost:8084/employees";

  constructor(private http:HttpClient) { }
  
  getEmployeeList():Observable<any>{
    let obs=this.http.get(this.baseUrl);
    return obs;
  }

  saveEmployee(employee: Employee):Observable<any>{
    const headers = { 'content-type': 'application/json'}  
    const body=JSON.stringify(employee);
    return this.http.post(this.baseUrl,body,{'headers':headers});
  }
}


