import express from 'express'
import { loggingMiddleware } from '../middleware/logging';
import { artists } from '../state';


// base path will be '/artists
export const artistRouter = express.Router()



//we do all proccessing in the order the code was written
//this will be first
artistRouter.get('', [ loggingMiddleware , (req,res)=>{
    
    res.json(artists)
}])

//this will be second
//can't run because the one above sends a response
artistRouter.get('', (req, res)=>{
    console.log('will I run?')
})

artistRouter.post('', (req, res)=>{
    // console.log(req.body)
    artists.push(req.body)
    res.json(artists)
})

//url conventions
//all related data will fall under one base path
// '/artists

//for a specific artist, using the unqiue id
// '/artists/:id'

//: is used to denote a path variable/param

//for any other specific using a non unique id
// '/artists/fieldname/:fieldname

artistRouter.get('/artistname/:name', (req,res)=>{
    let name = req.params.name//this is how we get user paramaters from the url
    for(let artist of artists){
        if(artist.name === name){
            res.json(artist)
        }
    }
    res.status(404)//resource not found
    res.send('That artist does not exist')
})