import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { BookserviceService } from '../bookservice.service';

@Component({
  selector: 'app-request-book',
  templateUrl: './request-book.component.html',
  styleUrls: ['./request-book.component.css']
})
export class RequestBookComponent implements OnInit {

  constructor(private bookService: BookserviceService,
    private router: Router) { }
    books;
    search;
    bookDetails;
    message: string;
    error:string;
  ngOnInit(): void {
    this.getBookDetails();
  }
  getBookDetails() {
    this.bookService.getData().subscribe(response => {
      console.log(response);
      this.books = response['bookDetails1'];
    }, error => {
      console.log(error);
    }
    );
  }

 requestBook(bookId){
   let userDetails=JSON.parse(localStorage.getItem('userDetails'));
   let userId=userDetails.userDetails.userId;
    this.bookService.requestData({ userId:userId,bookId:bookId }).subscribe(response =>{
      console.log(response);
      if(response.error){
        this.error = response.message;
        setTimeout(()=>{
          this.error = null;
        },5000);
      } else {
         this.message = 'request sent to admin successfully';
        //this.router.navigate(['/admin']);
        setTimeout(()=>{
          this.error = null;
        },5000);
      } 
      });
      
    }
  }