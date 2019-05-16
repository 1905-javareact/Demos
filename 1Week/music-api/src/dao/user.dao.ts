import {PoolClient} from 'pg'
import { connectionPool } from '.';
import { sqlUsertojsUSer } from '../util/user-converter';

//we are allowing getAllUsers to be added to our c++ apis
export async function getAllUsers(){
    let client:PoolClient
    //this connection might take some time to be made
    //we do it asynchronously

    //we will get a Promise
    try{
        client = await connectionPool.connect()//await says, wait for the promise to resolve
        //all code beneath the await will become a callback after the await is done
        let result = await client.query('SELECT * FROM "music-api".users')
        return result.rows.map(sqlUsertojsUSer)
    }catch(err){
        console.log(err); 
        return 'Internal Server'
    } finally{
        client && client.release()
    }
}