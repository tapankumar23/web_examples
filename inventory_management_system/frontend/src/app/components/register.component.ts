import {Component} from '@angular/core';
import {SecUser} from '../models/secuser';
import {RegisterService} from '../services/register.service';

@Component({
  selector: 'register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComp {
  title = 'register';
  newUser: SecUser = new SecUser();
  registered: boolean = false;

  constructor (private registerService: RegisterService) {}

  onSubmit() {
    this.registerService.sendUser(this.newUser)
    .subscribe(
      data => {
        this.registered = true;
        this.newUser = new SecUser();
      },
      error => console.log(error)
    );
  }
}
