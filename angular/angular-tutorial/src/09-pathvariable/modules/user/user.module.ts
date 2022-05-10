import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './components/login/login.component';
import { SignupComponent } from './components/signup/signup.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { RouterModule, Routes } from '@angular/router';
import { UserComponent } from './user/user.component';

const routes: Routes = [

  {
    path: "",
    component: UserComponent,
    children: [
      {
        path: "login",
        component: LoginComponent
      },
      {
        path: "signup",
        component: SignupComponent
      },
      {
        path: "welcome/:name",
        component: WelcomeComponent
      }
    ]
  }
  // { path: "abc", loadChildren: ()=>import("./modules/nest.module").then(m=>m.NestModule) },

];

@NgModule({
  declarations: [
    LoginComponent,
    SignupComponent,
    WelcomeComponent,
    UserComponent
  ],
  imports: [
    CommonModule,
    RouterModule.forChild(routes)
  ]
})
export class UserModule { }
