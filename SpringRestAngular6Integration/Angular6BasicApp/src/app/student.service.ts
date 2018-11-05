import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private http : HttpClient) { }

    getStudentList(){

     return this.http.get("http://jsonplaceholder.typicode.com/users");

    }

}
