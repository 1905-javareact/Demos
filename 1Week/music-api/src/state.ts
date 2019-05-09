import { Artist } from "./models/artist";
import { User } from "./models/user";

export let artists:Artist[] = [{
    name: 'Led Zepplin',
    numberOfMembers: 4,
    genre: 'classic Rock',
    albums:[
        'Led Zepplin',
        'Led Zepplin II'
    ]
},{
    name: 'Dr. Dre',
    numberOfMembers: 1,
    genre: 'G-Funk',
    albums:[
        'The Chronic',
        '2001'
    ]
}
]

export let users:User[] = [
    {
        username: 'ab',
        password: 'password',
        favoriteArtist: {
            name: 'Led Zepplin',
            numberOfMembers: 4,
            genre: 'classic Rock',
            albums:[
                'Led Zepplin',
                'Led Zepplin II'
            ]
        },
        id: 1
    }, new User('eli1', 'password', artists[1], 2 )
]