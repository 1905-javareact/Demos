function fun1(x){
    console.log(`fun1 a before ${x}`)//we know will be 5
    x = x + 1
    console.log(`fun1 a after ${x}`)//we know will be 6
}

let a = '5'
console.log(`a before fun1 ${a}`)//we know will be 5
fun1(a)//because a is a 'primitive' we just copy the value 5 and don't give access to a
console.log(`a after fun1 ${a}`)//is this going to be 5 or 6???


function fun2(obj){
    console.log(`fun1 obj before ${obj}`)//shouldn't have changed name
    obj.name = 'Alec'
    console.log(`fun1 obj after ${obj}`)//changed name
}

let b = {
    name: 'Eli',
    age: 'redacted'
}

console.log(b);//shouldn't have changed name
fun2(b)
console.log(b);//name should be changed


