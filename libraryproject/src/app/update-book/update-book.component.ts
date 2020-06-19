import { Component, OnInit } from '@angular/core';
import { BookserviceService } from '../bookservice.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
@Component({
  selector: 'app-update-book',
  templateUrl: './update-book.component.html',
  styleUrls: ['./update-book.component.css']
})
export class UpdateBookComponent implements OnInit {
  message:string;
  constructor(private bookService:BookserviceService , private router:Router) { }

  ngOnInit(): void {
  }
  updateBook(form: NgForm){
    this.bookService.postData(form.value).subscribe(response =>{
      console.log(response);
      form.reset();
      if(!response.error){
        this.message = 'Book updated successfully';
        this.router.navigate(['/bookdetails']);
      }
    },error =>{
      console.log(error);
    });
  }
}