import { preserveWhitespacesDefault } from "@angular/compiler";
import { Component } from "@angular/core";

@Component({
    selector: "app-root",
    templateUrl: "app.component.html",
    styleUrls: ["app.component.scss"]
})
export class AppComponent {
    myClass: string = "error";
    flag:boolean = false;
    myStyle={
        color: "white",
        "background-color": "black",
        "padding": "5px",
        "border-radius": "4px 10px"
    }

    toggle(){
        this.flag = !this.flag;
        if(this.flag){
            this.myClass = "success";
        } else {
            this.myClass = "error";
        }
    }
}