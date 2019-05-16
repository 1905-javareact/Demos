import {Pool} from 'pg'
console.log({
    user: process.env['MUSIC_API_USERNAME'],
    host: process.env['MUSIC_API_HOST'],
    database: process.env['MUSIC_API_DB_NAME'],
    password: process.env['MUSIC_API_PASSWORD'],
    port: 5432,
    max: 5 // max number of connections

})

//we are going to use a connection pool to help us manage our connections to the db
//we do this because making new connections is very expensive(takes a long time)
//so we configure the pool to make all the connections right away and then share them
//in use, we will ask the pool for a connection and when we are done we will return it


//use environment variables
export const connectionPool = new Pool({
    user: process.env['MUSIC_API_USERNAME'],
    host: process.env['MUSIC_API_HOST'],
    database: process.env['MUSIC_API_DB_NAME'],
    password: process.env['MUSIC_API_PASSWORD'],
    port: 5432,
    max: 5 // max number of connections

})