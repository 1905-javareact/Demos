import { IClickerState } from ".";
import { clickerTypes } from "../actions/clicker.actions";

const initialState: IClickerState = {
    clicks:0
}


export const clickerReducer = (state = initialState, action) => {
    switch (action.type) {
        case clickerTypes.INCREMENT_CLICKS:
            return {
                ...state,
                clicks: state.clicks + action.payload.clicks
            }
    }

    return state
}