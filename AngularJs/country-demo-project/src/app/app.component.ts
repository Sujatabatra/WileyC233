import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'country-demo-project';

  countryList: Country[]=[new Country("1","India"),
  new Country("2","US"),
  new Country("3","China"),
  new Country("4","Australia"),];

  onSubmit(formData:NgForm){
    console.log(formData.value);
  }
}
export class Country{
  // id:string;
  // name:string;
  constructor(public id:string,public name:string){
    // this.id=id;
    // this.name=name;
  }
}