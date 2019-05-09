import express from 'express'
import { artists } from './state';
import { loggingMiddleware } from './middleware/logging';
import bodyParser from 'body-parser'



const app = express();




//use hits every http method
//is we dont give a path, it will hit every path
//if it sends a response, we will never be able to do anything else
// app.use((req,res) =>{
//     res.json('We have an api woopee!!')
// })

//we have app.get
//app.post
//app.patch
//app.put
//app.delete
//and so on
//app.use counts as every http method
app.use(loggingMiddleware)

//a piece of middleware
//will take json attached to http body
//and turn it into a real js object for us to use
app.use(bodyParser.json())

app.get('/', (req, res)=>{
    res.json('Try making a request to /artists')
})

//we do all proccessing in the order the code was written
//this will be first
app.get('/artists', [ loggingMiddleware , (req,res)=>{
    
    res.json(artists)
}])

//this will be second
//can't run because the one above sends a response
app.get('/artists', (req, res)=>{
    console.log('will I run?')
})

app.post('/artists', (req, res)=>{
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

app.get('/artists/artistname/:name', (req,res)=>{
    let name = req.params.name//this is how we get user paramaters from the url
    for(let artist of artists){
        if(artist.name === name){
            res.json(artist)
        }
    }
    res.status(404)//resource not found
    res.send('That artist does not exist')
})


app.listen(9050, ()=>{
    console.log('app has started');  
})