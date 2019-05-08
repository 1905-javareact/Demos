let a:string = 'this is a string'

a = '5'

let b:string | number = 5

b = '5'

let c = () => {

}

function math(num1: number[] | string | null, num2:number): string{
    return 'isn\'t typescript great?'
}

math([1,2], 1)

//all the types in typescript

let v1: number;
let v2: string;
let v3: boolean;
//enums allow us to make our own types out of objects or interfaces
enum CardType{Playing, Magic, Yugioh}
let v4:CardType
//if a variable is void it can only be null or undefined
let v5:void 
let v6: null
//everything is allowed to be undefined
let v7: undefined
//just like javascript
let v8:any

let v9:never

let v10:number[]
let v11:never[]
let v12