import { createAction, props } from "@ngrx/store";

// class NType{
//     num:number=0;
// }

// class MyPayload{
//     payload: NType = new NType();
// }

export const increment = createAction('increment');
export const decrement = createAction('decrement');
export const reset = createAction('reset', props<{payload: {num:number}}>());