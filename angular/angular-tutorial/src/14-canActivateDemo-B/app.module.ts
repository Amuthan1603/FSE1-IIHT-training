import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { HeaderComponent } from './components/header/header.component';
import { RouterModule } from "@angular/router";
import { routes } from "./app.routing";

@NgModule({
    declarations: [AppComponent, LoginComponent, HomeComponent, WelcomeComponent, HeaderComponent],
    imports: [BrowserModule, RouterModule.forRoot(routes)],
    // providers: [UserService],
    bootstrap: [AppComponent]
})
export class AppModule { }