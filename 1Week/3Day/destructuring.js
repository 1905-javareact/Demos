let animal = {
    type: {
            family: 'dinosaur',
            species: 'Velociraptor'
            },
    weight: 'enough',
    numOfTeeth: 1000,
    flyable: 'maybe?',
    carnivore: true
}


let {carnivore, flyable} = animal;

console.log(`carnivore is ${carnivore} and flyable is ${flyable}`)
let {type} = animal
type.footprint = 'pretty big'

console.log(animal.type)

