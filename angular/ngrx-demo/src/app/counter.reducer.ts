import { createReducer, on } from '@ngrx/store';

import {increment, decrement, reset} from './counter.actions';

export const initialState = 0;

const _counterReducer = createReducer(
    initialState, 
    on(increment, (state)=> state + 1),
    on(decrement, (state)=> state - 1),
    on(reset, (state, action)=> action.payload.num )

)


export function counterReducer(state:any, action:any) {
    return _counterReducer(state, action)
}