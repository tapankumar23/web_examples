import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

//###########Components##############
import { AppComponent } from './app.component';
import { TestComponent } from './test.component';
import { HomeComponent } from './components/home.component';
import { LoginComponent } from './components/login.component';
import { UsersComponent } from './components/users.component';
import { RegisterComponent } from './components/register.component';
import { LogoutBelowComponent } from './components/logout-below.component';
import { AppHeaderComponent } from './components/app-header.component';
import { SuppliersListComponent } from './components/suppliers-list.component';

//###########Services##############
import { RegisterService } from './services/register.service';


@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    HomeComponent,
    LoginComponent,
    UsersComponent,
    LogoutBelowComponent,
    AppHeaderComponent,
    RegisterComponent,
    SuppliersListComponent
  ],
  imports: [
    BrowserModule
    ,FormsModule
    ,HttpModule
  ],
  providers: [RegisterService],
  bootstrap: [AppComponent,TestComponent]
  //bootstrap: [AppComponent,TestComponent,UsersComponent,SuppliersListComponent,LoginComponent,HomeComponent,RegisterComponent]
})
export class AppModule { }
