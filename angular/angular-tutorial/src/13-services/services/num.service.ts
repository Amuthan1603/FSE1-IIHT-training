import { Injectable } from "@angular/core";

@Injectable()
export class NumberService{
    private n:number = 0;

    // NumberService.num = 55;
    public set num(a:number){
        this.n = a;
    }

    // NumberService.num
    public get num(){
        return this.n;
    }
}