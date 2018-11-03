import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {


  addForm: FormGroup;

  constructor(private formBuilder : FormBuilder,private http : HttpClient) { }

  ngOnInit() {

    this.addForm = this.formBuilder.group({
      
      bookName: ['', Validators.required],
      author: ['', Validators.required],
      price: ['', Validators.required]
    });
  }


  onSubmit(){
    console.log("inside onsubmit");
      var book = this.addForm.value;
      console.log("data "+book);
      this.http.post("http://localhost:4444/SpringRestWithHibernateNew/add",{
        headers :{
          'Content-type' : 'application/json'
        }
      },book)

  }


}
