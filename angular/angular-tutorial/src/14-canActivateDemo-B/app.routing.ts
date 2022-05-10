import { Routes } from "@angular/router";
import { HomeComponent } from "./components/home/home.component";
import { LoginComponent } from "./components/login/login.component";
import { WelcomeComponent } from "./components/welcome/welcome.component";
import { UserValidGuard } from "./guards/user-valid.guard";

export const routes: Routes = [
    { path: "home", component: HomeComponent },
    { path: "login", component: LoginComponent },
    { path: "welcome", component: WelcomeComponent, canActivate:[UserValidGuard] },
    // { path: "history", component: HistoryComponent, canActivate:[UserValidGuard] },

    { path: "**", redirectTo: "home" }
];
