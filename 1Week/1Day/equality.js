//we have two ways to compare equality in js
//== and ===
//== does something we call type coercion
//it tries to convert both sides to the same type and then compare them
//=== compares value and type


let var1 = 5
let var2 = '5'
if(var1 === var2){
    console.log('true')
} else {
    console.log('false')
}