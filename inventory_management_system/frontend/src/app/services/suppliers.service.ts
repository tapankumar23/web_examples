import {Injectable} from '@angular/core';
import {Http, Headers} from '@angular/http';
import {Observable} from 'rxjs/Observable';

@Injectable()
export class SuppliersService {
  constructor (private http:Http){}

  getAllSuppliers(){
    let url = "http://localhost:8090/suppliers/allSuppliers";
    return this.http.get(url);
  }
}
