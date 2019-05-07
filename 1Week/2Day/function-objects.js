function car(engine, airbags, doors, topSpeed){
    this.airbags = airbags
    this.doors = doors
    this.engine = engine
    this.topSpeed = topSpeed
}


let prius =  new car("Hybrid", {}, 4, 25)
let lambo =  new car(
    'V28',
    {howMany: "a ton"},
    '2',
    697
)
let chevy =  new car(6, "a bunch", "at least 4", {gears: 6})

console.log(prius)
console.log(lambo)
console.log(chevy);
console.log(car)


