import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  message:string;
  error:string;
  
  constructor(private authService : AuthService,private router:Router) { }

  ngOnInit(): void {
  }
  registerUser(form:NgForm){
    console.log("krishnaveni");
    this.authService.register(form.value).subscribe(response =>{
      console.log(response);
      if(response.error){
        this.error=response.message;
        setTimeout( ()=>{
         this.error = null; 
        },5000);
      }else{
        this.message='User registered successfully,Please Login';
        this.router.navigate(['/login']);
        setTimeout( ()=>{
          this.message = null; 
         },5000);
      }
      
      form.reset();
    });
  }
  }
