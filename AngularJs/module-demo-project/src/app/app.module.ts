import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AppFirstChildComponent } from './app-first-child/app-first-child.component';
import { ViewModule } from './view/view.module';

@NgModule({
  declarations: [
    AppComponent,
    AppFirstChildComponent
  ],
  imports: [
    BrowserModule,
    ViewModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
