//in js we have this idea of truthy and falsy values
//this means that in boolean contexts, we will convert different types to booleans
//a few values become false all others are true

function tFCheck(a){
    if(a){
        console.log(`${a} is truthy`)
    }else{
        console.log(`${a} is falsy`)
    }
}

tFCheck(false)
tFCheck(null)
tFCheck(undefined)
tFCheck(0)
tFCheck('')
tFCheck({})
tFCheck([])
tFCheck(NaN)
