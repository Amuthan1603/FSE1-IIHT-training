import { Component } from "@angular/core";
import { FormControl, FormGroup, Validators } from "@angular/forms";
import { NGXLogger } from "ngx-logger";
import { Book } from "./models/Book";
import { BookService } from "./services/book.service";
import { MyLoggerMonitor } from "./services/log-monitor";

@Component({
    selector: "app-root",
    templateUrl: "app.component.html",
    styleUrls: ["app.component.scss"]
})
export class AppComponent {

    books:Book[] = [];
    showBookFormFlag:boolean = false;
    errorMessage:string = "";

    bookForm:FormGroup;

    constructor(private bookService:BookService, private logger: NGXLogger) {

        this.logger.registerMonitor(new MyLoggerMonitor());

        this.bookForm = new FormGroup({
            title: new FormControl("", [Validators.required]),
            author: new FormControl("", [Validators.required]),
            price: new FormControl(0, [Validators.required]),
        })

        this.logger.warn("some message")
    }
    
    showAllBooks(){
        this.findAllBooks();
    }


    showForm(){
        this.showBookFormFlag = true;
    }
    
    findAllBooks(){
        this.bookService.getAllBooks()
        .subscribe((res:any)=>{
            console.log(res);
            this.books = res;
        }, (err:any)=>{
            this.errorMessage = err.message;
            this.logger.error("some error occurred");
        })
    }
    
    saveBook(){
        console.log(this.bookForm.value);
        
        this.bookService.saveBook(this.bookForm.value)
        .subscribe(res=>{
            console.log(res);
            this.bookForm.reset();
            this.findAllBooks()
            this.showBookFormFlag = false;
        })
    }

    deleteBook(id:number){
        this.bookService.deleteBook(id)
        .subscribe(res=>{
            console.log(res);
            this.findAllBooks()
        })
    }

    gotoEditPage(book:Book){
        // localStorage.setItem("bookToEdit", JSON.stringify(book))
        // this.router.navigate(['/', 'books', 'edit'])
    }
}