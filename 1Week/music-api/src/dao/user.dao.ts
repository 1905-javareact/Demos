
import { connectionPool } from '.';
import { sqlUsertojsUSer } from '../util/user-converter';
import { PoolClient } from 'pg';

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


export async function findUserById(userId:number){
    let client:PoolClient

    try{
        client = await connectionPool.connect()//await cause this is async
        //this is how to write a paramaterized query
        //we use $1, $2 ... to represent params
        //we put all those params in an array and use it as the second argument
        let result = await client.query(`SELECT * FROM "music-api".users WHERE user_id = $1`, [userId])
        return sqlUsertojsUSer(result.rows[0])
    } catch(err){//check for what kind of error and send back appropriate custom error
        console.log(err)
        return '500'
    } finally {
        client && client.release()
    }
}


//login

export async function findUserByUsernameAndPassword(username:string, password:string){
    let client:PoolClient

    try{
        client = await connectionPool.connect()
        let query = 'SELECT * FROM "music-api".users WHERE username = $1 and user_pass = $2'
        let result = await client.query(query, [username, password])
        if(!result.rows[0]){
            return 'User not found'
        }
        return sqlUsertojsUSer(result.rows[0])

    }catch(err){
        console.log(err);
        return 'Internal'
    } finally{
        client && client.release()
    }
}