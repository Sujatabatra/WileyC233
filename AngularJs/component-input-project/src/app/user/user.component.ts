import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  
  @Input("name")
  userName:string="";

  @Input("age")
  uage:string="";

  user:string="";
  userAge:string="";

  constructor() {
    
   }

  ngOnInit(): void {
    this.user=this.userName;
    this.userAge=this.uage;
  }

}
