import { Component } from "@angular/core";
import { Book } from "./models/Book";

@Component({
    selector: "app-root",
    templateUrl: "app.component.html",
    styleUrls: ["app.component.scss"]
})
export class AppComponent {
    
    flag:boolean = false;

    books:Book[] = [
        new Book(12, "This is her book", "She", 5),
        {id: 4, title: "This is my book", author: "Me"},
        {id: 74, title: "This is your book", author: "You"},
        {id: 15, title: "This is our book", author: "We"},
        {id: 24, title: "This is his book", author: "He", price: 15}, 

        {id: 19, title: "This is their book", author: "They"}

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