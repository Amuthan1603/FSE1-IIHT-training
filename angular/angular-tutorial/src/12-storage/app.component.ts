import { Component } from "@angular/core";

@Component({
    selector: "app-root",
    templateUrl: "app.component.html",
    styleUrls: ["app.component.scss"]
})
export class AppComponent {
    message:string = "";

    read(value:string){
        console.log(value)
        this.message = value;
        localStorage.setItem("message", value);
    }
}