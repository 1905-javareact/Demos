//these are our short circuit operators
//they are also known as the guard and default operators

let user = {
    username: 'nameuser1778',
    password: 'username'
}

//user = undefined

//so long as user is truthy, that is that it exists, we can attempt to get username
let infoUsername = user && user.username

user = null

let loginMessage = user || "Username or Password is wrong"

console.log(infoUsername);
console.log(loginMessage);

let a = 5
let b = 10
console.log(`a && b = ${a && b}
'' && 0 = ${'' && 0}
0 || 15 = ${0 || 15}
10 || 15 = ${10 || 15}`)

