import { Component, OnInit } from '@angular/core';
import { select, Store } from '@ngrx/store';
import { Observable } from 'rxjs';
import { decrement, increment, reset } from 'src/app/counter.actions';

// class MyData{
//   public count:number = 0;
// }

@Component({
  selector: 'app-counter',
  templateUrl: './counter.component.html',
  styleUrls: ['./counter.component.sass']
})
export class CounterComponent implements OnInit {

  count$ : Observable<number>;

  constructor(private store: Store<{count:number}>) {
    this.count$ = store.pipe(select('count'));
    }


  ngOnInit(): void {
  }

  increase(){
    this.store.dispatch(increment())
  }
  decrease(){
    this.store.dispatch(decrement())
  }

  reset(n:number = 0){
    this.store.dispatch(reset(
      { payload: { num: n } }
    ))
  }

}
