import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from './../../models/User';
import { UserService } from './../../services/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  uname:string = "demo";
  valid: boolean = true;

  constructor(
    private userService:UserService,
    private router:Router
  ) { }

  ngOnInit(): void {
  }

  getLogin(){
    let u = new User();
    u.name = this.uname;
    u.valid = this.valid;


    this.userService.user = u;

    this.router.navigate(["welcome"])
  }

}
