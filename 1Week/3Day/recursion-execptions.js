/* 1. Fibonacci
Define function: fib(n) 
Return the nth number in the fibonacci sequence. */


function fib(n) {

    // is all input checking
    if(n === Infinity){
        throw {message:"what the heck, Im not a wizard"}
    }
    if(isNaN(n)){
        throw "Hey, n has to be a number"
    }
    if(n < 0){
       throw "Hey man, n has to be positive"
    }

    //this is a base case
    if(n === 0){
        return 0
    }
    //this is a base case
    if(n === 1){
        return 1
    }
    return fib(n-1) + fib(n-2)
}


//console.log("this is a test" - 1)
try{
    console.log(fib({
     field: "this is a test"
    }))
} catch(obj) {
    console.log(obj)
}
console.log(Infinity - 1)
try{
    console.log(fib(Infinity))
}catch(e){
    console.log(e)
}finally{
    console.log("Finally always runs")
}


try{ 
    fib('string')
} finally{

}
