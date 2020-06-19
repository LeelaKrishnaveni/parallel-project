import { Component, OnInit } from '@angular/core';
import { BookserviceService } from '../bookservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-remove-book',
  templateUrl: './remove-book.component.html',
  styleUrls: ['./remove-book.component.css']
})
export class RemoveBookComponent implements OnInit {

  constructor(private bookService: BookserviceService,
    private router: Router) {
   
  }

  books;
  message: string;
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

  deleteBook(bookdetails) {
    this.bookService.deleteData(bookdetails).subscribe(response => {
      console.log(response);
      if (response.error) {
        this.message = 'Failed to delete the book';
      } else {
        this.message = 'book deleted successfully';
      }
      setTimeout(() => {
        this.message = null;
      }, 5000);
      this.getBookDetails();
    });
  }

}
