import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AdminComponent } from './admin/admin.component';
import { UserComponent } from './user/user.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { BookDetailsComponent } from './book-details/book-details.component';
import { BookborrowedDetailsComponent } from './bookborrowed-details/bookborrowed-details.component';
import { BookbyAuthorComponent } from './bookby-author/bookby-author.component';
import { BookbyTitleComponent } from './bookby-title/bookby-title.component';
import { AddBookComponent } from './add-book/add-book.component';
import { ReturnBookComponent } from './return-book/return-book.component';
import { RequestBookComponent } from './request-book/request-book.component';
import { RemoveBookComponent } from './remove-book/remove-book.component';
import { ShowusersComponent } from './showusers/showusers.component';
import { ShowRequestsComponent } from './show-requests/show-requests.component';
import { SearchBookComponent } from './search-book/search-book.component';
import { UpdateBookComponent } from './update-book/update-book.component';
import { IssuedBooksComponent } from './issued-books/issued-books.component';
import { BookbyIdComponent } from './bookby-id/bookby-id.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AboutComponent } from './about/about.component';
import { BookFilterPipe } from './book-filter.pipe';
import { IssueBookComponent } from './issue-book/issue-book.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    AdminComponent,
    UserComponent,
    HomeComponent,
    HeaderComponent,
    BookDetailsComponent,
    BookborrowedDetailsComponent,
    BookbyAuthorComponent,
    IssueBookComponent,
    BookbyTitleComponent,
    AddBookComponent,
    ReturnBookComponent,
    RequestBookComponent,
    RemoveBookComponent,
    ShowusersComponent,
    ShowRequestsComponent,
    SearchBookComponent,
    UpdateBookComponent,
    IssuedBooksComponent,
    BookbyIdComponent,
    AboutComponent,
    BookFilterPipe,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
