import { Component } from "@angular/core";
import { FormControl, FormGroup, Validators } from "@angular/forms";

@Component({
    selector: "app-root",
    templateUrl: "app.component.html",
    styleUrls: ["app.component.scss"]
})
export class AppComponent {
    myForm:FormGroup;

    constructor(){
        this.myForm = new FormGroup({
            email: new FormControl("", [
                Validators.required,
                Validators.pattern("([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z]{2,4})")
            ]),
            password: new FormControl("", [
                Validators.required,
                Validators.minLength(5),
                Validators.maxLength(8)
            ])
        })
    }

    getLogin(){
        console.log("in login method")
        console.log(this.myForm)
        console.log(this.myForm.value)

        // send this data to server - ajax
        // response, reset form

        this.myForm.reset()
    }
}