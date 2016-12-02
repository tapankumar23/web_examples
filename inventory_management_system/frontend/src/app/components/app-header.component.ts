import { Component } from '@angular/core';
import {LoginService} from '../services/login.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './app-header.component.html',
  styleUrls: []
})
export class AppHeaderComp {
  myLocalStorage;
  private currentUserName;

  constructor (private loginService:LoginService, private router: Router) {
    this.myLocalStorage=localStorage;
    this.currentUserName=localStorage.getItem("currentUserName");
  }

  onClick() {
    alert(this.loginService.checkLogin());
    if (this.loginService.checkLogin()) { this.loginService.logout(); }
    this.router.navigate(['/login']);
  }
}
