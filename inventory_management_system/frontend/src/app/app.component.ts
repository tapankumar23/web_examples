import { Component } from '@angular/core';

import { HomeComp } from './components/home.component';
import { RightMenuComp } from './components/right-menu.component';
import {LoginService} from './services/login.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
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
