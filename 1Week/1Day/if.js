//what is an if statement
//conditional, if statements have an expression
//if that expression is true, we will execute the if statement's code
let a = false;

if(a) {
    console.log("a is true")
} else {
    console.log("a is false")
}

let num = -50

if(num < 0){
    console.log("num is negative")
} else if( num >= 0 && num < 25) {
    console.log("num is bteween 0 and 24")
} else {
    console.log("num is 25 or greater")
}