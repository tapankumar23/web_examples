import { ModuleWithProviders }  from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComp }  from './components/home.component';
import { LoginComp }  from './components/login.component';
import { RegisterComp }  from './components/register.component';
import { SuppliersListComp } from './components/suppliers-list.component';
import { DemoComponent } from './components/demo.component';


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
    component: DemoComponent
  }
];

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);
