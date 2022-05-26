import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { FirstChildComponent } from './first-child/first-child.component';
import { DateComponent } from './first-child/date/date.component';
import { TemplateInterpolationComponent } from './template-interpolation/template-interpolation.component';
import { AddressCardComponent } from './address-card/address-card.component';

@NgModule({
  declarations: [
    AppComponent,
    FirstChildComponent,
    DateComponent,
    TemplateInterpolationComponent,
    AddressCardComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
