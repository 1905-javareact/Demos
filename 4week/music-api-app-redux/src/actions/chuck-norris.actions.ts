import {  clickerTypes } from "./clicker.actions";

export const chuckNorrisTypes = {
    NEW_CHUCK_NORRIS_JOKE: 'CHUCK_NORRIS_NEW_JOKE',
    BUYING_JOKE: 'CHUCK_NORRIS_BUYING_JOKE'
}


export const buyJoke = () => async (dispatch) =>{
    dispatch({
        type: chuckNorrisTypes.BUYING_JOKE
    })
    const response = await fetch('http://api.icndb.com/jokes/random?limitTo=[nerdy]')
    const resBody = await response.json()
    dispatch({
        payload:{
            clicks: -100
        },
        type: clickerTypes.INCREMENT_CLICKS
    })
    dispatch({
        payload:{
            currentJoke:resBody.value.joke
        },
        type: chuckNorrisTypes.NEW_CHUCK_NORRIS_JOKE
    })

}