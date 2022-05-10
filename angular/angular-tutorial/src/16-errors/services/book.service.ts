import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Book } from "./../models/Book";
import { throwError } from "rxjs";

@Injectable({ providedIn: "root" })
export class BookService {

    private url: string = "http://localhost:3000/books";

    constructor(private httpClient: HttpClient) { }

    getAllBooks() {
        return this.httpClient.get(this.url);
    }

    saveBook(book: Book) {
        return this.httpClient.post(this.url, book).pipe(this.errorHandler)
    }

    deleteBook(id: number) {
        return this.httpClient.delete(this.url + "/" + id).pipe(this.errorHandler)
    }

    findBookById(id: number) {
        return this.httpClient.get(this.url + "/" + id);
    }

    modifyBook(id: number, book: Book) {
        return this.httpClient.put(this.url + "/" + id, book);
    }

    errorHandler(err:any){
        console.log("some error occurred")
        // localStorage.setItem("errorMessage", err);
        // this.router.navigate(["error"])
        return throwError(err);
    }

}