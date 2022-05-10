import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  getLogin(){
    var username = 'miley';
    // navigate from method/logic
    this.router.navigate(['/', 'user', 'welcome', username])
  }

}
