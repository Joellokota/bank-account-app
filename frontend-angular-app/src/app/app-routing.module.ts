import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {AccountComponent} from "./account/account.component";
import {ProfileComponent} from "./profile/profile.component";
import {CustomerComponent} from "./customer/customer.component";
import {LoginComponent} from "./login/login.component";
import {AdminTemplateComponent} from "./admin-template/admin-template.component";
import {AuthGuard} from "./guards/auth.guard";
import {AuthorizationGuard} from "./guards/authorization.guard";

const routes: Routes = [
  { path: '', component: LoginComponent, pathMatch: 'full' },
  { path: 'login', component: LoginComponent },
  { path: 'admin', component: AdminTemplateComponent,
    canActivate : [AuthGuard],
    children: [
      { path: 'home', component: HomeComponent },
      { path: 'account', component: AccountComponent },
      { path: 'profile', component: ProfileComponent,
            canActivate: [AuthorizationGuard], data: { roles: ['ADMIN'] }},
      { path: 'customer', component: CustomerComponent}
    ] },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
