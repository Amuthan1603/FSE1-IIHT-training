import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.scss']
})
export class WelcomeComponent implements OnInit {
  username:string = "";
  constructor(private activatedRoute: ActivatedRoute) { 
    this.activatedRoute.params.subscribe((pathvariable)=>{
      console.log(pathvariable.name);
      this.username = pathvariable.name;
    });
  }

  ngOnInit(): void {
  }

}
