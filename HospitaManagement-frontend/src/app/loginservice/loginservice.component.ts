import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-loginservice',
  templateUrl: './loginservice.component.html',
  styleUrls: ['./loginservice.component.css']
})
export class LoginserviceComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  loginService(){
    this.router.navigate(['home']);
  }

  loggin(){
    this.loginService();
    console.log("loginSuccessful");
  }


}
