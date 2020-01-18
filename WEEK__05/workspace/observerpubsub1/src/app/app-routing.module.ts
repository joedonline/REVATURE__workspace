import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

/*
export { ComicDeckComponent } from './comic-deck/comic-deck.component';
export { AddComicPageComponent } from './add-comic-page/add-comic-page.component';
export { EditComicPageComponent } from './edit-comic-page/edit-comic-page.component';
export { AboutPageComponent } from './about-page/about-page.component';
*/

import {
  HomePageComponent,
  ComicDeckComponent,
  AddComicPageComponent,
  EditComicPageComponent,
  AboutPageComponent,
} from './app-routes';

const routes: Routes = [
  {
    path: "",
    component: HomePageComponent,
  },
  {
    path: "deck",
    component: ComicDeckComponent,
  },
  {
    path: "add",
    component: AddComicPageComponent,
  },
  {
    path: "edit",
    component: EditComicPageComponent,
  },
  {
    path: "about",
    component: AboutPageComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
