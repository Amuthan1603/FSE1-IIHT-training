import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'power'
})
export class PowerPipe implements PipeTransform {

  transform(value: number, exp:number=1): number {
    console.log("value: "+value)
    console.log("exp: "+exp)
    return Math.pow(value, exp);
  }

}
