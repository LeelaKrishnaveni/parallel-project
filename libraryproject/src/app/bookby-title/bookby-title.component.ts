import { Component, OnInit } from '@angular/core';
import { BookserviceService } from '../bookservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-bookby-title',
  templateUrl: './bookby-title.component.html',
  styleUrls: ['./bookby-title.component.css']
})
export class BookbyTitleComponent implements OnInit {
   bookName;
  books;
  bookdetails:string;
  constructor(private bookService: BookserviceService, private router: Router) {
    this.getBooksByName(this.bookdetails);
  }
  ngOnInit(): void {
  }
  getBooksByName(bookdetails) {
    this.bookService.getSearchByTitle(bookdetails).subscribe(response => {
      console.log(response);
      this.books = response['bookDetails1'];
    }, error => {
      console.log(error);
    }
    );
  }
}
