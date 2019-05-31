import {  clickerTypes } from "./clicker.actions";

import { chuckNorrisClient } from "../axios/chuck-norris-api.client";

export const chuckNorrisTypes = {
    NEW_CHUCK_NORRIS_JOKE: 'CHUCK_NORRIS_NEW_JOKE',
    BUYING_JOKE: 'CHUCK_NORRIS_BUYING_JOKE'
}


export const buyJoke = () => async (dispatch) =>{
    dispatch({
        type: chuckNorrisTypes.BUYING_JOKE
    })
    
    dispatch({
        payload:{
            clicks: -100
        },
        type: clickerTypes.INCREMENT_CLICKS
    })
    dispatch({
        payload:{
            currentJoke: await chuckNorrisClient.randomJoke()
        },
        type: chuckNorrisTypes.NEW_CHUCK_NORRIS_JOKE
    })

}