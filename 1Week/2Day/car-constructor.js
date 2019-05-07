class Car{
    constructor(engine, airbags, topSpeed, doors){
        this.airbags = airbags
        this.engine = engine
        this.topSpeed = topSpeed
        this.doors = doors
        this.safetyRating = 0
    }
    
    run(){
        console.log("I am driving real fast");
    }

}
Car.safetyRating = 0//this adds a field to the class that we access with Car
//Car.run() //run belongs to the objects not the class

let prius = new Car('hybrid', {}, 25, 4)

prius.radio = true

console.log(prius);
