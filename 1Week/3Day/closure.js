let car = {}

//this is our outer function
function makeCarYearGetterSetter() {
    let year = 1980
    //we have two inner functions
    //first is the getter, the second, the setter
    //if we want both functions to be able to use the variable year
    //they both have to be declared in the same outer function
    return [()=>{
        return year
    }, (newValue) => {
        if(newValue){
            year = newValue
        }
        return year
    }]
}
//generate our two functions
let yearFunctions = makeCarYearGetterSetter();
//add them to our object
car.getYear = yearFunctions[0]
car.setYear = yearFunctions[1]
console.log(car.getYear())
console.log(car.setYear('Kia'))