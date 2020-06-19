import { Component, OnInit } from '@angular/core';
import { BookserviceService } from '../bookservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-book-details',
  templateUrl: './book-details.component.html',
  styleUrls: ['./book-details.component.css']
})
export class BookDetailsComponent implements OnInit {
  books;
  message:string;
  search:string;
  constructor(private bookService : BookserviceService,private router :Router) { 
    this.getBooks();
  }

  ngOnInit(): void {
  }
  getBooks() {
    this.bookService.getData().subscribe(response => {
      console.log(response);
      this.books = response['bookDetails1'];
    }, error => {
      console.log(error);
    }
    );
  }
  selectBook(bookDetails){
    this.router.navigate(['/updateBook']);
  }
  deleteBook(bookDetails) {
    this.bookService.deleteData(bookDetails).subscribe(response => {
      console.log(response);
      if (response.error) {
        this.message = 'Failed to delete the book';
      } else {
        this.message = 'book deleted successfully';
      }
      setTimeout(() => {
        this.message = null;
      }, 5000);
      this.getBooks();
    });
  }

}
