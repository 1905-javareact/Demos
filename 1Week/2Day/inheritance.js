//prototypical inheritance
//we are allowed to set our inheritance whenever we want
//this builds something we call the prototype chain
//the protoype chain is a path from out object to the super object


//has a proto of the super object
let parent = {
    a:5,
    b:10
}

let child = {
    a:15,
    c:25
}
child.__proto__ = parent
Object.setPrototypeOf(child, parent)
 console.log(child.d)
 Object.getPrototypeOf(parent).d = 20
 console.log(child.d)
console.log(child.a);

let obj3 = {}

console.log(obj3.d);

