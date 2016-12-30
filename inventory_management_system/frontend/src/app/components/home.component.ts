import { Component } from '@angular/core';
import {LoginService} from '../services/login.service';
import {TestComp} from './test.component';

@Component({
  selector: 'home',
  templateUrl: './home.component.html',
  styleUrls: []
})
export class HomeComp {
  private currentUserName;

  constructor (private loginService: LoginService){
    this.currentUserName=localStorage.getItem("currentUserName");
  }
}
