import {Component} from '@angular/core';
import {User} from '../models/user';
import {RegisterService} from '../services/register.service';

@Component({
  selector: 'register',
  templateUrl: './register.component.html',
    styles: [`
    .container {
      align-items: center;
      justify-content: center;
      padding: 24px;
      flex: none;
    }
  `]
})
export class RegisterComp {
  title = 'register';
  newUser: User = new User();
  registered: boolean = false;

  constructor (private registerService: RegisterService) {}

  onSubmit() {
    this.registerService.sendUser(this.newUser)
    .subscribe(
      data => {
        this.registered = true;
        this.newUser = new User();
      },
      error => console.log(error)
    );
  }
}
