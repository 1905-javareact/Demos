import express from 'express'

const app = express();



app.use((req,res) =>{
    res.json('We have an api woopee!!')
})


app.listen(9050, ()=>{
    console.log('app has started');  
})