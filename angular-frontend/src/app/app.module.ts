import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { EntranceComponent } from './entrance/entrance.component';
import { ExitComponent } from './exit/exit.component';
import { MovsComponent } from './movs/movs.component';

@NgModule({
  declarations: [
    AppComponent,
    EntranceComponent,
    ExitComponent,
    MovsComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
