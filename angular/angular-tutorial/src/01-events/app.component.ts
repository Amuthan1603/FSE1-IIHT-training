import { Component } from "@angular/core";

@Component({
    selector: "app-root",
    templateUrl: "app.component.html",
    styleUrls: ["app.component.scss"]
})
export class AppComponent {
    num:number = 10;

    increase(){
        this.num = this.num + 1;
    }

    decrease(){
        this.num--;
    }

    onInputChange(n:number){
        console.log(n)
        console.log(typeof n)
        this.num = n;
    }

    reset(){
        this.num = 0;
    }
}