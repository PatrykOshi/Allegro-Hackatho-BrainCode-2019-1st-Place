import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SubscriptionButtonComponent } from './subscription-button/subscription-button.component';
import { SubscriptionComponent } from './subscription/subscription.component';
import {BsDropdownModule, ModalModule, TooltipModule} from "ngx-bootstrap";

@NgModule({
  declarations: [
    AppComponent,
    SubscriptionButtonComponent,
    SubscriptionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BsDropdownModule.forRoot(),
    TooltipModule.forRoot(),
    ModalModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
