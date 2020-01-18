import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClient } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { ComicCardComponent } from './comic-card/comic-card.component';
import { HeaderComponent } from './header/header.component';
import { LogoComponent } from './logo/logo.component';
import { FooterComponent } from './footer/footer.component';
import { AdColumnComponent } from './ad-column/ad-column.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ComicDeckComponent } from './comic-deck/comic-deck.component';
import { DeckPageComponent } from './deck-page/deck-page.component';
import { FormPageComponent } from './form-page/form-page.component';
import { AddComicPageComponent } from './add-comic-page/add-comic-page.component';
import { AboutPageComponent } from './about-page/about-page.component';
import { EditComicPageComponent } from './edit-comic-page/edit-comic-page.component';
import { HomePageComponent } from './home-page/home-page.component';
import { ComicFormComponent } from './comic-form/comic-form.component';

@NgModule({
  declarations: [
    AppComponent,
    ComicCardComponent,
    HeaderComponent,
    LogoComponent,
    FooterComponent,
    AdColumnComponent,
    NavbarComponent,
    ComicDeckComponent,
    DeckPageComponent,
    FormPageComponent,
    AddComicPageComponent,
    AboutPageComponent,
    EditComicPageComponent,
    HomePageComponent,
    ComicFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClient,
    FormsModule,
  ],
  exports: [],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
