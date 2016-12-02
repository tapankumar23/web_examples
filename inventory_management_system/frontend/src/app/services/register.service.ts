import {Injectable} from '@angular/core';
import {Http, Headers} from '@angular/http';
import {User} from '../models/user';
import {Observable} from 'rxjs/Observable';

@Injectable()
export class RegisterService {
  constructor (private http:Http){}

  sendUser(user:User){
    console.log(JSON.stringify(user));
    let url = "http://localhost:8090/user/register";
    let headers1 = new Headers({'Content-Type': 'application/json'});
    return this.http.post(url, JSON.stringify(user), {headers: headers1});
  }
}
