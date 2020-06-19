import { Component, OnInit } from '@angular/core';
import { BookserviceService } from '../bookservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-show-requests',
  templateUrl: './show-requests.component.html',
  styleUrls: ['./show-requests.component.css']
})
export class ShowRequestsComponent implements OnInit {
  requests;
  message:string;
    constructor(private bookService : BookserviceService,
      private router:Router) {
      this.getRequestDetails();
    }
  
  ngOnInit(): void {
  }
  
  getRequestDetails(){
    this.bookService.getRequestData().subscribe(response => {
      console.log(response);
      this.requests = response.requestDetails1;
    }, error => {
      console.log(error);
    }
    );
  }
  issueData(requestDetails1){
    this.bookService.issueData({userId: requestDetails1.userId, bookId: requestDetails1.bookId}).subscribe(response => {
      console.log(response);
      if ( !response.error){
        this.message = 'Book Issue successfully';
      }else{
        this.message = 'Book not Issue';
      }
      this.getRequestDetails();
      setTimeout(() => {
        this.message = null;
      }, 5000);
  
    });
  }
}