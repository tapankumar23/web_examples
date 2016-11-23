import {Injectable} from '@angular/core';
import {Http, Headers} from '@angular/http';
import {SecUser} from '../models/secuser';
import {Observable} from 'rxjs/Observable';

@Injectable()
export class RegisterService {
  constructor (private http:Http){}

  sendUser(secUser:SecUser){
    console.log(JSON.stringify(secUser));
    let url = "http://localhost:8090/user/register";
    let headers1 = new Headers({'Content-Type': 'application/json'});
    return this.http.post(url, JSON.stringify(secUser), {headers: headers1});
  }
}
