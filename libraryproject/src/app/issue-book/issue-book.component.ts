import { Component, OnInit } from '@angular/core';
import { BookserviceService } from '../bookservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-issue-book',
  templateUrl: './issue-book.component.html',
  styleUrls: ['./issue-book.component.css']
})
export class IssueBookComponent implements OnInit {
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
    this.requests = response.requests;
  }, error => {
    console.log(error);
  }
  );
}
issueData(request){
  this.bookService.issueData({userId: request.userId, bookId: request.bookId}).subscribe(response => {
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