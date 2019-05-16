import { add, divide } from "./calculator";

//
export function avg(one:number, two:number, three:number){
    const sum = add(one, add(two,three))
    return divide(sum, 3)
}