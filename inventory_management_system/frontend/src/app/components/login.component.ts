import {Component} from '@angular/core';
import {Observable}  from 'rxjs/Observable';
import {LoginService} from '../services/login.service';
import {Router} from '@angular/router';

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styles: [`
    .container {
      align-items: center;
      justify-content: center;
      padding: 24px;
      flex: none;
    }
  `]
})
export class LoginComp {

  private model = {'username':'', 'password':''};
  private currentUserName;

  constructor (private loginService: LoginService, private router: Router){
    this.currentUserName=localStorage.getItem("currentUserName");
    if (this.loginService.checkLogin()) this.router.navigate(['/home']);
  }

  onSubmit() {
    this.loginService.sendCredential(this.model).subscribe(
      data => {
                localStorage.setItem("token", JSON.parse(JSON.stringify(data))._body);
                this.loginService.sendToken(localStorage.getItem("token")).subscribe(
                  data => {
                            this.currentUserName=this.model.username;
                            localStorage.setItem("currentUserName", this.model.username);
                            this.model.username='';
                            this.model.password='';
                          },
                  error => {
                            alert('Failed :: '+this.currentUserName+' Error :: '+error);
                            console.log(error);
                          }
                );
              },
      error => console.log(error)
    );
  }
}
