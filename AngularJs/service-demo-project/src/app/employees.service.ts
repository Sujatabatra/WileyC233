import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmployeesService {

  constructor() { }

  public getEmployees(){
    return [
      {id:1,name:"Sujata",gender:"female"},
      {id:2,name:"Zaman",gender:"male"},
      {id:3,name:"Atharva",gender:"male"},
      {id:4,name:"Akhil",gender:"male"},
      {id:5,name:"Roshini",gender:"female"},
    ]
  }
  
}
