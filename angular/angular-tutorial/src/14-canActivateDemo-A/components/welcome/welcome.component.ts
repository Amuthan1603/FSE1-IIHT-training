import { Component, OnInit } from '@angular/core';
import { UserService } from './../../services/user.service';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.scss']
})
export class WelcomeComponent implements OnInit {

  username:string = "";

  constructor(private userService:UserService) { 
    this.username = this.userService.user.name;
  }

  ngOnInit(): void {
  }

}
