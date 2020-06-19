import { Component, OnInit } from '@angular/core';
import { BookserviceService } from '../bookservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-bookby-author',
  templateUrl: './bookby-author.component.html',
  styleUrls: ['./bookby-author.component.css']
})
export class BookbyAuthorComponent implements OnInit {
  authorName;
  books;
  bookdetails:string;
  constructor(private bookService:BookserviceService,private router:Router) {
    this.getBooksByAuthor(this.bookdetails);
   }

  ngOnInit(): void {
  }
  
    getBooksByAuthor(bookdetails) {
      this.bookService.getSearchByAuthor(bookdetails).subscribe(response => {
        console.log(response);
        this.books = response.bookDetails1;
      }, error => {
        console.log(error);
      }
      );
    }

}
