//we have three ways to make strings in javascript

let s1 = "eli says, \" javascript is great\""
let s2 = 'world, Ralph says\' "javascript is rad"'

let template = `Template literals allow us to use
multi line strings
they also allow string interpolation
this means we can directly inject js expressions into our string.
we do this with $ and {}
for example
s1 = ${s1 + s2}
s2 = ${100 * 9 / 57}
random number = ${Math.floor(Math.random()* 5 + 1)}`

console.log(template)