import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import {
  FeaturesComponent,
  NavbarComponent,
  PricingComponent,
  HomepageComponent,
} from './app-routes';

const routes: Routes = [
  {
    path: "",
    component: HomepageComponent,
  },
  {
    path: "features",
    component: FeaturesComponent,
  },
  {
    path: "navbar",
    component: NavbarComponent,
  },
  {
    path: "pricing",
    component: PricingComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
