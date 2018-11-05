import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {UserService} from "../service/user.service";
import {User} from "../model/user.model";

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})
export class ListUserComponent implements OnInit {

  users: User[];
  searchbox : string;

  searchData : string;

  constructor(private router: Router, private userService: UserService) {
    
   }

  ngOnInit() {
   
    this.userService.getUsers().subscribe( data => {
        this.users = data;
      });
  }




  listUser(){
    if(this.searchData=="" || this.searchData=='undefined')
    this.userService.getUsers()
    .subscribe( data => {
      this.users = data;
    });
    else
    this.userService.getSearchUsers(this.searchData)
    .subscribe( data => {
      this.users = data;
    });
  }

  deleteUser(user: User): void {
    this.userService.deleteUser(user.id)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

  editUser(user: User): void {
    localStorage.removeItem("editUserId");
    localStorage.setItem("editUserId", user.id.toString());
    this.router.navigate(['edit-user']);
  };

  addUser(): void {
    this.router.navigate(['add-user']);
  };


  saerchText(value){

    this.searchData = value;
    this.listUser();
    // if(this.searchData!=""){
    //     this.listUser();
    // }
    // else{
    //   console.log("inside search "+value  );
    //   console.log("users are "+this.users);
      

      // let searchArray  :any =  [];
      // this.users.forEach(element => {
        
      //   console.log(element.id+" "+element.lastName+" "+element.firstName+" "+element.email);
      //   if(element.email == value){
      //     searchArray.push(element);
      //   }
      // });
      // this.users = searchArray;

  }

}
