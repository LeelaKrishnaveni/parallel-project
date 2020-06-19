import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { BookserviceService } from '../bookservice.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {
  message:string;
  error:string;
  constructor(private bookService:BookserviceService , private router:Router) { }

  ngOnInit(): void {
  }
  postBook(form: NgForm){
    this.bookService.postData(form.value).subscribe(response =>{
      console.log(response);
      form.reset();
      if(!response.error){
        this.message = 'Book added successfully';
        this.router.navigate(['/admin']);
      }
    },error =>{
      console.log(error);
    });
   }
}
