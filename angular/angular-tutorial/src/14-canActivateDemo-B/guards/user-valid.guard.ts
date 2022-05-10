import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { UserService } from '../services/user.service';

@Injectable({
  providedIn: 'root'
})
export class UserValidGuard implements CanActivate {
  
  constructor(private userService:UserService, private router:Router){}

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): boolean {
      if(this.userService.user.valid){
        /* if (role == admin){
        this.router.navigate(["admin"]);
        }*/
        /* if (role == manage){
        this.router.navigate(["manager"]);
        }*/
        return true;
      } else {
        this.router.navigate(["login"]);
        return false;
      }
      
    
  }
  
}
