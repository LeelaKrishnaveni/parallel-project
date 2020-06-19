import { Component, OnInit } from '@angular/core';
import { BookserviceService } from '../bookservice.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-bookborrowed-details',
  templateUrl: './bookborrowed-details.component.html',
  styleUrls: ['./bookborrowed-details.component.css']
})
export class BookborrowedDetailsComponent implements OnInit {
  borrows;
  constructor(private bookService : BookserviceService,private router:Router) {
    
   }
   message:string;
   error:string;
  ngOnInit(): void {
    this.getBorrowedDetails();
  }
  getBorrowedDetails(){
    let userDetails=JSON.parse(localStorage.getItem('userDetails'));
  this.bookService.getBorrowedData({userId:userDetails.userDetails.userId}).subscribe(response => {
      console.log(response);
      this.borrows = response.bookBorrowedDetails1;
    }, error => {
      console.log(error);
    }
    );
  }
  bookReturn(book) {
    this.bookService.returnData({ bookId: book.bookId, userId: book.userId }).subscribe(response => {
      console.log(response);
      if (response.error) {
        this.error = 'Book is not Returned';
        setTimeout(() => {
          this.error = null;
        }, 5000);
      } else {
        this.message = 'Book returned to the library';
      }
      setTimeout(() => {
        this.message = null;
      }, 5000);
    });

  }
}