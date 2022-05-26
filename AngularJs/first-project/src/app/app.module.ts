import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HelloWorldComponent } from './hello-world/hello-world.component';
import { DemoCompComponent } from './hello-world/demo-comp/demo-comp.component';

@NgModule({
  declarations: [
    AppComponent,
    HelloWorldComponent,
    DemoCompComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
