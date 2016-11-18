import { ModuleWithProviders }  from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComp }  from './components/home.component';
import { LoginComp }  from './components/login.component';
import { RegisterComp }  from './components/register.component';

const appRoutes: Routes = [
  {
    path: '',
    redirectTo: '/register',
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
  }
];

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);
