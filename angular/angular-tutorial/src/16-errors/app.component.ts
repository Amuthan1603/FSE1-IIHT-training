import { Component } from "@angular/core";
import { FormControl, FormGroup, Validators } from "@angular/forms";
import { Book } from "./models/Book";
import { BookService } from "./services/book.service";

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

    constructor(private bookService:BookService) {
        this.bookForm = new FormGroup({
            title: new FormControl("", [Validators.required]),
            author: new FormControl("", [Validators.required]),
            price: new FormControl(0, [Validators.required]),
        })
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
            console.log("some error occurred");
            this.errorMessage = err.message;
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