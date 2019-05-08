
let arr = [1, 1, 2, 3, 5, 8, 13, 21]

let cb = (ele, index, arr) => {
    console.log(`ele + 5 = ${ele + 5} at index of ${index}`)
    arr[index] = ele+5
}

arr.forEach(cb)

//we wrote our own forEach function and added it to the array super
//so all arrays would get our new foreach function
//function name(somecB)

Object.getPrototypeOf(arr).myForEach = (someCb) => {
    for(let i = 0; i < this.length; i++){
        someCb(i,this[i])
    }
}

arr.myForEach(cb)
console.log(arr)