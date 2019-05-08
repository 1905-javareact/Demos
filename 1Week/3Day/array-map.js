let cars = [
    {
        make: 'ford',
        model: 'escape',
        year: 2018,
    },
    {
        make: 'kia',
        model: 'soul',
        year: 1979
    },
    {
        make: 'ford',
        model: 'explorer',
        year: 2003
    },
    {
        make:'BMW',
        model: 'M5',
        year: 1989
    }
]

//the purpose is to allow us to make changes to the elements in our array
//it is still following functional programming rules, and will make a new array with those changes
//we have to return the new element to replace the old one
let stateFarmsCars = cars.map((ele) => {
    if(ele.make === 'ford'){
        return {
         ...ele,//spread operator
        //make: ele.make
        //model: ele.model
        //year: ele.year
        insurance: true
        }
    } else {
        return {
            ...ele
        }

    }
}).filter((ele)=> {
    if(ele.insurance){
        return true
    } else {
        return false
    }
})
console.log(stateFarmsCars);



