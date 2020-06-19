import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { UserComponent } from './user/user.component';
import { SearchBookComponent } from './search-book/search-book.component';
import { HomeComponent } from './home/home.component';
import { AddBookComponent } from './add-book/add-book.component';
import { RemoveBookComponent } from './remove-book/remove-book.component';
import { UpdateBookComponent } from './update-book/update-book.component';
import { ShowusersComponent } from './showusers/showusers.component';
import { ShowRequestsComponent } from './show-requests/show-requests.component';
import { IssuedBooksComponent } from './issued-books/issued-books.component';
import { RequestBookComponent } from './request-book/request-book.component';
import { ReturnBookComponent } from './return-book/return-book.component';
import { BookborrowedDetailsComponent } from './bookborrowed-details/bookborrowed-details.component';
import { BookDetailsComponent } from './book-details/book-details.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AboutComponent } from './about/about.component';
import { AuthGuard } from './authguard';
import { IssueBookComponent } from './issue-book/issue-book.component';
import { HeaderComponent } from './header/header.component';

const routes: Routes = [

  
  {path:'about',component:AboutComponent},
  {path:'home',component:HomeComponent},
  {path:'admin',component:AdminComponent, canActivate: [AuthGuard], data:{role:['admin']}},
  {path:'user',component:UserComponent, canActivate:[AuthGuard], data:{role:['user']}},
  {path:'search-book',component:SearchBookComponent,canActivate:[AuthGuard], data:{role:['user']}},
  {path:'addBook',component:AddBookComponent,canActivate:[AuthGuard], data:{role:['admin']}},
  {path:'removeBook',component:RemoveBookComponent,canActivate:[AuthGuard], data:{role:['admin']}},
  {path:'updateBook',component:UpdateBookComponent,canActivate:[AuthGuard], data:{role:['admin']}},
  {path:'showUsers',component:ShowusersComponent,canActivate:[AuthGuard], data:{role:['admin']}},
  {path:'showRequests',component:ShowRequestsComponent,canActivate:[AuthGuard], data:{role:['admin']}},
  {path:'issuedBooks',component:IssuedBooksComponent,canActivate:[AuthGuard], data:{role:['admin']}},
  {path:'requestBook',component:RequestBookComponent,canActivate:[AuthGuard], data:{role:['user']}},
  {path:'returnBook',component:ReturnBookComponent,canActivate:[AuthGuard], data:{role:['user']}},
  {path:'bookborrowedDetails',component:BookborrowedDetailsComponent,canActivate:[AuthGuard], data:{role:['user']}},
  {path:'bookDetails',component:BookDetailsComponent,canActivate:[AuthGuard], data:{role:['admin']}},
  {path:'issueBook',component:IssueBookComponent,canActivate:[AuthGuard], data:{role:['admin']}},
  {path:'login',component:LoginComponent},
  {path:'register',component:RegisterComponent},
  //{path:'/',component:HomeComponent}
  {path:'',redirectTo:'home',pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
