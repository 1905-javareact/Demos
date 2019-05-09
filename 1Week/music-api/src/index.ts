import express from 'express'

import { loggingMiddleware } from './middleware/logging';
import bodyParser from 'body-parser'
import { artistRouter } from './routers/artist-router';
import { userRouter } from './routers/user-router';



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

//ww use app.use
//provide the base path
//and the express router variable we made in the router file
app.use('/artists', artistRouter)

app.use('/users', userRouter)


app.listen(9050, ()=>{
    console.log('app has started');  
})