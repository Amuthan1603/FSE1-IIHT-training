import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";
import { CapitalizePipe } from "./pipes/capitalize.pipe";
import { PowerPipe } from './pipes/power.pipe';

@NgModule({
    declarations: [AppComponent, CapitalizePipe, PowerPipe],
    imports: [BrowserModule],
    bootstrap: [AppComponent]
})
export class AppModule { }