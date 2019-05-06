//var has two scopes global/module and function
//let and const, they have those two scopes and block scope

var a = 5
let b = 8

function test() {
    //hoisting!!, whenever we are in a function and we declare using var
    //we are going to get a phantom declaration at the top of the function
    //it looks like this
    //var c

    console.log(`a is ${a} and b is ${b}`)
    a = 25
    b = 10
    console.log(`c is ${c}`)
    if(true){
        var c = 15
        let d = 0
    }
    console.log(`c is ${c}`)
    //console.log(`d is ${d}`) this gives us an error
}

test()

console.log(`a is ${a} and b is ${b}`)