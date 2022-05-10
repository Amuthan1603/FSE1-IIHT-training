import { Component } from "@angular/core";
import { NumberService } from "./services/num.service";

@Component({
    selector: "app-root",
    templateUrl: "app.component.html",
    styleUrls: ["app.component.scss"]
})
export class AppComponent {
  
    constructor(public service:NumberService){
       
    }

    increase(){
        this.service.num = this.service.num + 1;
    }
    decrease(){
        this.service.num = this.service.num - 1;
    }
}