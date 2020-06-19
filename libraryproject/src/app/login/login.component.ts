import { Component, OnInit } from '@angular/core';
import {  AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  error:string;
  constructor(private authService : AuthService,private router : Router) { }

  ngOnInit(): void {
  }
  

  loginUser(form: NgForm){
    this.authService.login(form.value).subscribe(response =>{
      console.log(response);
      if(response.error){
        this.error = response.message;
        setTimeout(()=>{
          this.error = null;
        },5000);
      } else{
        localStorage.setItem('userDetails',JSON.stringify(response));
        this.router.navigate(['']);
      }
      form.reset();
    })
  }

}
