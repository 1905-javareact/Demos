//let and const, they were added in 2015 with es6
//they are preffered over var because they have block scoping
//also, because var hoists while let and const do not

let a = 5//use let or const
const c = 25//const cannot be reassigned after being declared
var v = 15//don't use var!!!

pleasedont = 'hello' //don't use variables without declaring them

console.log('a = ' + a)
console.log('c = ' + c)
console.log('v = ' + v)
console.log(pleasedont)

a = 'hello'
console.log('a = ' + a)