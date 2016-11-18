import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import {routing} from './app.routing';

//###########Components##############
import { AppComponent } from './app.component';
import { TestComp } from './test.component';
import { HomeComp } from './components/home.component';
import { LoginComp } from './components/login.component';
import { UsersComp } from './components/users.component';
import { RegisterComp } from './components/register.component';
import { LogoutBelowComp } from './components/logout-below.component';
import { AppHeaderComp } from './components/app-header.component';
import { SuppliersListComp } from './components/suppliers-list.component';
import { RightMenuComp } from './components/right-menu.component';

//###########Services##############
import { RegisterService } from './services/register.service';

@NgModule({
  declarations: [
    AppComponent,
    TestComp,
    HomeComp,
    LoginComp,
    UsersComp,
    LogoutBelowComp,
    AppHeaderComp,
    RegisterComp,
    SuppliersListComp,
    RightMenuComp
  ],
  imports: [
    BrowserModule
    ,FormsModule
    ,HttpModule
    ,routing
  ],
  providers: [RegisterService],
  bootstrap: [AppComponent]
  //bootstrap: [AppComp,TestComp,UsersComp,SuppliersListComp,LoginComp,HomeComp,RegisterComp]
})
export class AppModule { }
