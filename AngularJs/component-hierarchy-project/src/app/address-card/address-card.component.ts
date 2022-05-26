import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-address-card',
  templateUrl: './address-card.component.html',
  styleUrls: ['./address-card.component.css']
})
export class AddressCardComponent implements OnInit {

  user:any;

  constructor() {
    this.user={
      name:'Sujata',
      title:'Batra',
      address:'Delhi',
      phone:[1234567890,9876543210]
    };
   }

  ngOnInit(): void {
  }

}
