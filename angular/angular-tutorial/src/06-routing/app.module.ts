import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";
import { HeaderComponent } from './components/header/header.component';
import { HomeComponent } from './components/home/home.component';
import { FooterComponent } from './components/footer/footer.component';
import { AboutComponent } from './components/about/about.component';
import { RouterModule, Routes } from "@angular/router";

const routes:Routes = [
    { path: "home", component: HomeComponent },
    { path: "about", component: AboutComponent }
];

@NgModule({
    declarations: [AppComponent, HeaderComponent, HomeComponent, FooterComponent, AboutComponent],
    imports: [
        BrowserModule,
        RouterModule.forRoot(routes)
    ],
    bootstrap: [AppComponent]
})
export class AppModule { }