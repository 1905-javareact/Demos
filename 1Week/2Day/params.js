
function doMath(a , b = 10, ...params){
    console.log(a+b)
    console.log(params)
    let result = 0
    for(let i = 0; i < params.length; i++){
        result += params[i]
    }
    console.log(result+a+b)
}

doMath(1,2)
doMath(1)
doMath(1,2,3,4,'not a number',6.5)

