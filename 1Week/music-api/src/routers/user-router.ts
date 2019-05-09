import express from 'express'
import { users } from '../state';


export const userRouter = express.Router()



userRouter.get('', (req, res)=>{
    res.json(users)
})