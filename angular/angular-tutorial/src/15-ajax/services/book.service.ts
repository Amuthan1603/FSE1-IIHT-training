import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Book } from "./../models/Book";

@Injectable({providedIn: "root"})
export class BookService{

    private url:string = "http://localhost:3000/books";
    // private url:string = "https://jsonplaceholder.typicode.com/users";

    constructor(private httpClient:HttpClient){}

    getAllBooks(){
        // fetch('http://localhost:3000/books', {
        //     method: 'GET', // or 'PUT'
        //     headers: {
        //       'Content-Type': 'application/json'
        //     }
        //   })
        //     .then(response => response.json())
        //     .then(json => console.log(json))
          
        return this.httpClient.get(this.url);
    }

    saveBook(book:Book){
//         fetch('http://localhost:3000/books', {
//     method: 'POST', // or 'PUT'
//     headers: {
//         'Content-Type': 'application/json'
//     },
//     body: JSON.stringify({ "title": "This is my awesome book", "author": "Miley", "price": 12 }),
//     })
//   .then(response => response.json())
//   .then(json => console.log(json))

return this.httpClient.post(this.url, book);

}

deleteBook(id:number){
    return this.httpClient.delete(this.url+"/"+id);
}

findBookById(id:number){
    return this.httpClient.get(this.url+"/"+id);
}

modifyBook(id:number, book:Book){
    return this.httpClient.put(this.url+"/"+id, book);
}

}