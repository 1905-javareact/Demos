//the for in loop is a loop that will get us every key in an object
//sometimes objects have more keys than we were expecting
let obj = {
    field1: 5,
    name: 'Alec',
    num: 27,
    speak: ()=>{console.log(`${this.name} says hello`)}
}

for(let objectfield in obj){
    console.log(`key is ${objectfield} 
    and the value is ${obj[objectfield]}`)
}