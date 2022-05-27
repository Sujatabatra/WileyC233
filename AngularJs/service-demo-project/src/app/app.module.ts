import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { EmployeesService } from './employees.service';
import { EmployeelistComponent } from './employeelist/employeelist.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeelistComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [EmployeesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
