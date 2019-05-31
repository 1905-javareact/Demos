import { IChuckNorrisState } from ".";
import { chuckNorrisTypes } from "../actions/chuck-norris.actions";

//set up initial state
const initialState: IChuckNorrisState = {
    currentJoke: 'Waiting on a joke, what a joke',
    buyingJoke: false
}

//we have switch for all the different types of chuck norris actions
//and we update state accordingly
export const chuckNorrisReducer = (state = initialState, action) => {
    switch (action.type) {
        case chuckNorrisTypes.NEW_CHUCK_NORRIS_JOKE:
            return {
                ...state,
                currentJoke: action.payload.currentJoke,
                buyingJoke: false
            }
        case chuckNorrisTypes.BUYING_JOKE:{
            return {
                ...state,
                buyingJoke: true
            }
        }
    }

    return state
}