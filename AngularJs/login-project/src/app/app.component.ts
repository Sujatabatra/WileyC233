import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'login-project';
  
  status:string="";
  check(formData:NgForm){

    console.log(formData.value);
    
    if(formData.controls['username'].value===formData.controls['password'].value)
      this.status="Login SuccessFul";
    else
      this.status="Login Failed";
  }

}
