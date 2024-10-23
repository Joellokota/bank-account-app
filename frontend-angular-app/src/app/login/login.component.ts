import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {AuthService} from "../services/auth.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent implements OnInit {
  public loginForm!: FormGroup;
  constructor(private fb : FormBuilder, private auth : AuthService,
              private router : Router) {

  }
  ngOnInit() {
    this.loginForm = this.fb.group({
      username: this.fb.control(''),
      password: this.fb.control('')
    })
  }

  login() {
    let username = this.loginForm.value.username;
    let password = this.loginForm.value.password;
    let authValue : boolean = this.auth.login(username, password);
    if (authValue) {
      this.router.navigateByUrl("/admin");
    }
  }
}
