import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Headers } from '@angular/http';
import { HttpHeaders } from '@angular/common/http';
//RequestOptions
import { RequestOptions } from '@angular/http';

import {User} from "../model/user.model";
import {Observable} from 'rxjs';
import { of } from 'rxjs';


@Injectable()
export class UserService {

  constructor(private http: HttpClient) { }
  baseUrl = 'http://localhost:4444/SrpingRestWithHibernate/user';

  getUsers() {
    /* let fakeUsers = [{id: 1, firstName: 'Dhiraj', lastName: 'Ray', email: 'dhiraj@gmail.com'},
     {id: 1, firstName: 'Tom', lastName: 'Jac', email: 'Tom@gmail.com'},
     {id: 1, firstName: 'Hary', lastName: 'Pan', email: 'hary@gmail.com'},
     {id: 1, firstName: 'praks', lastName: 'pb', email: 'praks@gmail.com'},
   ];*/
   //return of(fakeUsers);
    return this.http.get<User[]>(this.baseUrl + "/list");
  }

  getSearchUsers(value) {
    /* let fakeUsers = [{id: 1, firstName: 'Dhiraj', lastName: 'Ray', email: 'dhiraj@gmail.com'},
     {id: 1, firstName: 'Tom', lastName: 'Jac', email: 'Tom@gmail.com'},
     {id: 1, firstName: 'Hary', lastName: 'Pan', email: 'hary@gmail.com'},
     {id: 1, firstName: 'praks', lastName: 'pb', email: 'praks@gmail.com'},
   ];*/
   //return of(fakeUsers);
    return this.http.get<User[]>(this.baseUrl + "/list?email="+value);
  }


  

  getUserById(id: number) {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json',
     })
    };
    return this.http.get<User>(this.baseUrl + '/getuser/' + id,httpOptions);
  }

  createUser(user: User) {
    //let headers = new Headers({ 'Content-Type': 'application/json' });
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json',
     })
    };
   // let options = new RequestOptions({ headers: headers });
    
    return this.http.post(this.baseUrl+'/add', user,httpOptions);
  }

  updateUser(user: User) {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json',
     })
    };
   
    return this.http.post(this.baseUrl + '/update/',user,httpOptions);
  }

  deleteUser(id: number) {
    let headers = new Headers({ 'Content-Type': 'application/json'});
    let options = new RequestOptions({ headers: headers });
    return this.http.options(this.baseUrl + '/deletenew/' + id);
  }
}
