import { Component } from "@angular/core";

@Component({
    selector: "app-root",
    // template: "<h2><mark>abcdef</mark></h2>"
    templateUrl: "app.component.html",
    styleUrls: ["app.component.scss"]
})
export class AppComponent {
    constructor() {
        console.log("This is app component")
    }
}