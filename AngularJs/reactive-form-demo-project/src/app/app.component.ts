import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'reactive-form-demo-project';
  userForm=new FormGroup({
    name:new FormControl("Sujata"),
    email:new FormControl(),
    address:new FormGroup({
      street:new FormControl(),
      city:new FormControl(),
      postalcode:new FormControl()
    })
  });

  public onSubmit(){
    console.log(this.userForm.value);
  }
}
