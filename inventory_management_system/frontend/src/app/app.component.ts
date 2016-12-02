import { Component } from '@angular/core';

import { AppHeaderComp } from './components/app-header.component';
import { HomeComp } from './components/home.component';
import { RightMenuComp } from './components/right-menu.component';
import {LoginService} from './services/login.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: []
})
export class AppComponent {
  myLocalStorage;
  private currentUserName;

  constructor (private loginService:LoginService) {
    this.myLocalStorage=localStorage;
    this.currentUserName=localStorage.getItem("currentUserName");
  }

  onClick() { if (this.loginService.checkLogin()) { this.loginService.logout(); } }
}
