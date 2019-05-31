import { ITicTacToeState } from ".";


const initialState: ITicTacToeState = {
    board: [[' ', ' ', ' '],
            [' ', ' ', ' '],
            [' ', ' ', ' ']],
    winner: '',
    whosTurn: false
}


export const ticTacToeReducer = (state = initialState, action) => {
    switch (action.type) {
        
    }

    return state
}