import { Artist } from "./artist";


//a model representing a user of our api
export class User {
    username:string
    password:string
    favoriteArtist: Artist|null
    id:number
    roles:string[]
    constructor(username:string = '', password:string = '', favA:Artist = null, id?:number, roles?:string[]){
        this.username = username
        this.password = password
        this.favoriteArtist = favA
        this.id = id || 0
        this.roles = roles || []
    }
}


