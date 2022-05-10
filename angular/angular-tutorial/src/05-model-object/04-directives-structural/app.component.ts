import { preserveWhitespacesDefault } from "@angular/compiler";
import { Component } from "@angular/core";

@Component({
    selector: "app-root",
    templateUrl: "app.component.html",
    styleUrls: ["app.component.scss"]
})
export class AppComponent {
    
    flag:boolean = false;

    books = [
        {id: 4, title: "This is my book", author: "Me"},
        {id: 74, title: "This is your book", author: "You"},
        {id: 15, title: "This is our book", author: "We"}
    ]

    message:string = "Some error occurred...";

    toggle(){
        this.flag = !this.flag;
        if(this.flag){
            this.message = "";
        } else {
            this.message = "Some error occurred...";
        }
    }
}