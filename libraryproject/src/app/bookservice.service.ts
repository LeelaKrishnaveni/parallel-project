import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BookserviceService {

  constructor(private http: HttpClient) { }
  myURL = 'http://localhost:8080/librarymanagementsystem_spring/';

  getData() {
    return this.http.get(`${this.myURL}BooksInfo`);
  }
  postData(books) {
    return this.http.post<any>(`${this.myURL}addBook`, books);
  }
  deleteData(bookdetails) {
    return this.http.delete<any>(`${this.myURL}removeBook/${bookdetails.bookId}`);
  }
  returnData(bookdetails) {
    return this.http.post<any>(`${this.myURL}returnBook`,bookdetails);
  }
putData(bookdetails){
  return this.http.put<any>(`${this.myURL}bookUpdate`,bookdetails);
}
  

  getUserData() {
    return this.http.get<any>(`${this.myURL}showUsers`);
  }
  issueData(bookdetails){
    return this.http.post<any>(`${this.myURL}issueBook`,bookdetails);
  }
  cancelRequest(bookdetails){
    return this.http.post<any>(`${this.myURL}rejectRequest`,bookdetails);
  }

  getIssuedData() {
    return this.http.get<any>(`${this.myURL}showIssuedBooks`);
  }

  getSearchById(bookdetails) {
    return this.http.get<any>(`${this.myURL}BooksById/${bookdetails}`);
  }

  getSearchByTitle(bookdetails) {
    return this.http.get<any>(`${this.myURL}BooksByName/${bookdetails}`);
  }

  getSearchByAuthor(bookdetails) {
   
    return this.http.get<any>(`${this.myURL}BooksByAuthor?authorName=${bookdetails}`);
  }

  
  getRequestData() {
    return this.http.get<any>(`${this.myURL}showRequests`);
  }
  requestData(bookdetails){
    return this.http.post<any>(`${this.myURL}requestBook`,bookdetails);
  }

  getuserId() {
    var user=JSON.parse(localStorage.getItem('userDetails1'));
    console.log(user.userId);
    return user.userId;
  }

  getBorrowedData(bean){
    return this.http.post<any>(`${this.myURL}getBorrowedBooks`,bean);
  }
}