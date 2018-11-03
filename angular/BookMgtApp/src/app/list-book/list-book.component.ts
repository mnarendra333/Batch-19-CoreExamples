import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import { Book } from '../book.model';


@Component({
  selector: 'app-list-book',
  templateUrl: './list-book.component.html',
  styleUrls: ['./list-book.component.css']
})

export class ListBookComponent{

  books : Book[];
  addForm: FormGroup;
  response :object;
 
  constructor(private http: HttpClient) { }

  ngOnInit() {
   this.http.get<Book[]>("http://localhost:4444/SpringRestWithHibernateNew/list").
   subscribe(data  => {
     this.books = data;
   });
    
  }


  deleteBooks(id : number){

    console.log("inside delete"+id);
     this.http.post("http://localhost:4444/SpringRestWithHibernateNew/delete?id="+id,{}).subscribe(
      data =>{
        this.response = data;
      }
    )
  }


  onSubmit(){
    console.log("inside onsubmit");
      var book = this.addForm.value;
      this.http.post("http://localhost:4444/SpringRestWithHibernateNew/add",{
        headers :{
          'Content-type' : 'application/json'
        },book
      })

  }

 
  


 
}
