import { Component, OnInit } from '@angular/core';
import { NumberService } from 'src/13-services/services/num.service';

@Component({
  selector: 'app-comp1',
  templateUrl: './comp1.component.html',
  styleUrls: ['./comp1.component.scss']
})
export class Comp1Component  {
  
  constructor(public service:NumberService){}
}
