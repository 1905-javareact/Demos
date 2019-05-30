import { combineReducers } from "redux";
import { User } from "../models/user";
import { loginReducer } from "./login.reducer";
//this is where we will define all of the types for our global state
//we will do this by making different kinds of interfaces to represent different parts of state
//generally these interfaces will be linked to a component

export interface ILoginState{
    currentUser:User
    errorMessage:string
}
//every interface we declare will end up getting it's own reducer
export interface IClickerState{
    clicks: number
}

export interface IChuckNorrisState{
    currentJoke:string
}

//this is an interface that represents all of the state we are keeping track of
//for the entire application
export interface IState{
    login:ILoginState
    // clicker:IClickerState
    // chuckNorris: IChuckNorrisState

}


//this is going to build all of the reducers that modify state into one single 
//combined super reducer that will act as the global state object
export const state = combineReducers<IState>({
    login: loginReducer,
    // clicker: clickerReducer,
    // chuckNorris: chuckNorrisReducer
})