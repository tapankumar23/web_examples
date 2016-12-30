import { ModuleWithProviders }  from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComp }  from './components/home.component';
import { LoginComp }  from './components/login.component';
import { RegisterComp }  from './components/register.component';
import { SuppliersListComp } from './components/suppliers-list.component';
import { UsersComp }  from './components/users.component';
import { DemoComponent } from './components/demo.component';
import { FinanceComponent } from './components/finance.component';
import { CategoriesComponent } from './components/categories.component';


const appRoutes: Routes = [
  {
    path: '',
    redirectTo: '/home',
    pathMatch: 'full'
  },
  {
    path: 'home',
    component: HomeComp
  },
  {
    path: 'login',
    component: LoginComp
  },
  {
    path: 'register',
    component: RegisterComp
  },
  {
    path: 'suppliers',
    component: SuppliersListComp
  },
  {
    path: 'users',
    component: UsersComp
  },
  {
    path: 'demo',
    component: DemoComponent
  },
  {
    path: 'finance',
    component: FinanceComponent
  },
  {
    path: 'categories',
    component: CategoriesComponent
  }
];

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);
