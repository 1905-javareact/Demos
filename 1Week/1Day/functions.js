//functions exist so we can reuse code

function doMath(a,b,c){
    return (a/b) + c
}

console.log(doMath(2,4,1))

let result = doMath(5,6,7)
console.log(result)

//up next, we have arrow functions, also called anonymous functions

let mathFunc = (a , b) => {
    return a * a + b * b
}

console.log(mathFunc(3, 6))