import { Request, Response } from "express";

export function corsFilter (req:Request,res:Response,next){
    console.log(req.headers.origin);
    

    res.header('Access-Control-Allow-Origin', `${req.headers.origin}`)//this is a hack, if you do it in a project I will be very disappointed in you
    res.header('Access-Control-Allow-Headers', 'Origin, X-Requested-With, Content-Type, Accept')
    res.header('Access-Control-Allow-Credentials', 'true')
    next();
}