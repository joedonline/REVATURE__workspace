import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MysecondcomponentComponent } from './mysecondcomponent/mysecondcomponent.component';
import { AnothercomponentComponent } from './anothercomponent/anothercomponent.component';

@NgModule({
  declarations: [
    AppComponent,
    MysecondcomponentComponent,
    AnothercomponentComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
