import { Component, Input, OnInit } from '@angular/core';
import { User } from '../user.model';

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {

  isCollapse:boolean=true;
  inputText:string ="Initial Value";
  
  @Input("user")
  userObj:User=new User();
  constructor() { }

  ngOnInit(): void {
  }
  
  toggleCollapse(){
    this.isCollapse=!this.isCollapse;
  }

}
