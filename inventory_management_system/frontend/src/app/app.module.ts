import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { CommonModule } from '@angular/common';
import { Angular2DataTableModule } from 'angular2-data-table';
import { DataTableModule } from "angular2-datatable";
import {routing} from './app.routing';

//###########Components##############
import { AppComponent } from './app.component';
import { TestComp } from './test.component';
import { HomeComp } from './components/home.component';
import { LoginComp } from './components/login.component';
import { UsersComp } from './components/users.component';
import { RegisterComp } from './components/register.component';
import { SuppliersListComp } from './components/suppliers-list.component';
import { RightMenuComp } from './components/right-menu.component';
import { DataFilterPipe }   from './components/data-filter.pipe';
import { DemoComponent }   from './components/demo.component';

//###########Services##############
import { RegisterService } from './services/register.service';
import { LoginService } from './services/login.service';

@NgModule({
  declarations: [
    AppComponent
    ,TestComp
    ,HomeComp
    ,LoginComp
    ,UsersComp
    ,RegisterComp
    ,SuppliersListComp
    ,RightMenuComp
    ,DataFilterPipe
    ,DemoComponent
  ],
  imports: [
    BrowserModule
    ,FormsModule
    ,HttpModule
    ,routing
    ,CommonModule
    ,Angular2DataTableModule
    ,DataTableModule
  ],
  providers: [RegisterService,LoginService],
  bootstrap: [AppComponent]
  //bootstrap: [AppComp,TestComp,UsersComp,SuppliersListComp,LoginComp,HomeComp,RegisterComp,DemoComponent]
})
export class AppModule { }
