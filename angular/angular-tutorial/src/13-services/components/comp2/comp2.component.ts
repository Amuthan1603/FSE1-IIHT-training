import { Component, OnInit } from '@angular/core';
import { NumberService } from 'src/13-services/services/num.service';

@Component({
  selector: 'app-comp2',
  templateUrl: './comp2.component.html',
  styleUrls: ['./comp2.component.scss']
})
export class Comp2Component {
  
  constructor(public service:NumberService){
    service.num = 65;
  }

}