//an array in js is a collection of values
let arr = [
    'Alec',
    'Ralph',
    'Eva',
    42,
    {
        airbags:{
            left:true,
            right:true
        }
    }
]



console.log(arr[6])

arr.push('this goes to the end')
arr.unshift('this goes to the beginning')

for(let i = 0; i < arr.length; i++){
    console.log(arr[i])
}

//enhanced for loop, also know as the for of loop
for(let key of arr){
    console.log(key)
}

console.log(arr)

let matrix = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
]

console.log(matrix[0])
console.log(matrix[1][1])

console.log(arr.slice(2, 4))
console.log(arr)
console.log(arr.splice(1,3))
