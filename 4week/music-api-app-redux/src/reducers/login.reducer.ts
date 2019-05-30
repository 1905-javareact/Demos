import { ILoginState } from ".";
import { loginTypes } from "../actions/login.actions";


const initialState: ILoginState = {
    currentUser: undefined,
    errorMessage: undefined
}


export const loginReducer = (state = initialState, action) => {
    switch (action.type) {
        case loginTypes.INVALID_CREDENTIALS:
            return {
                ...state,
                errorMessage: 'Invalid Credentials'
            }
        case loginTypes.FAILED_TO_LOGIN:
            return {
                ...state,
                errorMessage: 'Failed to login, oopsie'
            }
        case loginTypes.SUCCESSFUL_LOGIN:
            return {
                ...state,
                currentUser: action.payload.user,
                errorMessage:undefined
            }
        default:
    }

    return state
}