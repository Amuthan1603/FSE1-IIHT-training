import { Pipe } from "@angular/core";

@Pipe({name: "capitalize"})
export class CapitalizePipe {
    transform(input:string){
        console.log("in transform, input: "+input);
        return input.charAt(0).toLocaleUpperCase() + input.substring(1).toLocaleLowerCase();
    }
}