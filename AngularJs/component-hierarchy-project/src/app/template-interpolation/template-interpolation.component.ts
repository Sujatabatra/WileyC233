import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-template-interpolation',
  templateUrl: './template-interpolation.component.html',
  styleUrls: ['./template-interpolation.component.css']
})
export class TemplateInterpolationComponent implements OnInit {

  sumNos:number=10;
  
  addTwoNos(a:number,b:number):number{
    return a+b;
  }

  constructor() { }

  ngOnInit(): void {
  }

}
