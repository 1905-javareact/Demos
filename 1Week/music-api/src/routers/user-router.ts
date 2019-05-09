import express from 'express'
import { users } from '../state';
import { User } from '../models/user';



export const userRouter = express.Router()


//get methods of the base path should give all information
userRouter.get('', (req, res)=>{
    res.json(users)
})

//An endpoint to add a new user to the users state
//we should verify that the fields they send us are correct
//also that they are all there

//endpoint for making a new user
userRouter.post('', (req, res)=>{
    let {body} = req //destructuring
    let newUser = new User() // make a new user
    for(let key in newUser ){//loop through all fields on user
        if(!body[key]){//if they didn't give us one
            res.status(400).send('please include all user fields')//fail
            break;
        }else{
            newUser[key] = body[key]//else set new field
        }
    }
    if(!res.finished){
        users.push(newUser)//add user to state
        res.json(newUser)//send back new user
    }
})


//an endpoint to find 1 user by their id
//for the unique id we can put the colon after the base path
//for all other fields, we need to give them an addition name

// '/users/:id
// '/users/username/:username
// '/users/favoriteartist/artistname/:name

userRouter.get('/:id', (req, res)=>{
    let id = +req.params.id//id is string by default, adding the + turns to int
    let user = users.find((u) =>{ 
        return u.id === id
    })
    if(user){
        res.json(user)
    } else {
        res.sendStatus(400)
    }
})