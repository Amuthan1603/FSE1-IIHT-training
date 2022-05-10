import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";
import { Comp1Component } from './components/comp1/comp1.component';
import { Comp2Component } from './components/comp2/comp2.component';
import { NumberService } from "./services/num.service";

@NgModule({
    declarations: [AppComponent, Comp1Component, Comp2Component],
    imports: [BrowserModule],
    providers: [NumberService],
    bootstrap: [AppComponent]
})
export class AppModule { }