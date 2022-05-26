import { Component } from '@angular/core';
import { User } from './user.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'event-handling-form-input-project';

  user:User;
  
  constructor(){
    this.user=new User();
    this.user.fName="Harshit";
    this.user.lName="Shukla";
    this.user.address="Some Address in Bangalore";
    this.user.phoneNo=["99999999","65437890"];
    
  }

}
