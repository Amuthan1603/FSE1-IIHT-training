import { preserveWhitespacesDefault } from "@angular/compiler";
import { Component } from "@angular/core";

@Component({
    selector: "app-root",
    templateUrl: "app.component.html",
    styleUrls: ["app.component.scss"]
})
export class AppComponent {
    title:string = "aNguLaR";
    now:number = Date.now();
    today: Date = new Date();
}