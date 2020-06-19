import { Component, OnInit } from '@angular/core';
import { BookserviceService } from '../bookservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-bookby-id',
  templateUrl: './bookby-id.component.html',
  styleUrls: ['./bookby-id.component.css']
})
export class BookbyIdComponent implements OnInit {

  bookdetails: number;
  constructor(private bookService: BookserviceService, private router: Router) {
    this.getBooksById(this.bookdetails);
  }
bookId;
  books;
  ngOnInit(): void {
  }

  getBooksById(bookdetails) {
    this.bookService.getSearchById(bookdetails).subscribe(response => {
      console.log(response);
      this.books = response.bookDetails;
    }, error => {
      console.log(error);
    }
    );
  }

}
