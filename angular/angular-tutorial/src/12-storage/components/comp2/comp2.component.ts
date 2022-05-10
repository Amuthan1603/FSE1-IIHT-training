import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-comp2',
  templateUrl: './comp2.component.html',
  styleUrls: ['./comp2.component.scss']
})
export class Comp2Component implements OnInit {

  message:string = "";
  constructor() { }

  ngOnInit(): void {
  }

  load(){
    this.message = localStorage.getItem("message") || "";
  }

}
