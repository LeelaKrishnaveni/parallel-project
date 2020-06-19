import { Component, OnInit } from '@angular/core';
import { BookserviceService } from '../bookservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-showusers',
  templateUrl: './showUsers.component.html',
  styleUrls: ['./showUsers.component.css']
})
export class ShowusersComponent implements OnInit {
 users;
  constructor(private bookService: BookserviceService, private router: Router) {
    this.getUserData();
   }
  getUserData(){
    this.bookService.getUserData().subscribe(response => {
      console.log(response);
      this.users = response.userDetails1;
    }, error => {
      console.log(error);
    })
  }

  ngOnInit(): void {
  
  }

}
