import { ITicTacToeState } from ".";
import { ticTacToeTypes } from "../actions/tictactoe.actions";

//false is x
//true is o
const initialState: ITicTacToeState = {
    board: [[' ', ' ', ' '],
            [' ', ' ', ' '],
            [' ', ' ', ' ']],
    winner: '',
    whosTurn: false
}


export const ticTacToeReducer = (state = initialState, action) => {
    switch (action.type) {
        case ticTacToeTypes.CELL_CLICK:{
            if(state.winner){
                return state
            }else {
            let letter = cellLetter(state.board[action.payload.row][action.payload.column], state.whosTurn)
            let newBoard = [...state.board]
            newBoard[action.payload.row][action.payload.column] = letter
            //I should check for winner
            let newWinner = checkWinner(state.board)
            return {
                ...state,
                board:newBoard,
                whosTurn: !state.whosTurn,
                winner: newWinner   
            }
            }
        }
    }

    return state
}

const cellLetter = (cell:string, letter:boolean) =>{
    if(cell !== ' '){
        return cell
    }
    else {
        if(letter){
            return 'o'
        } else {
            return 'x'
        }
    }


}

const checkWinner = (board:string[][]) => {
        //all horizontals
        let res = ''
        for (const row of board) {
            if((row[0] === row[1])&& (row[0]=== row[2]) && row[0] !== ' '){
                res = row[0]
            }   
        }
        res ? res = res : res = board[0].reduce((total, cell, index)=>{
            if((cell === board[1][index])&& (cell=== board[2][index]) && cell !== ' ' ){
                return total + cell
            }else {
                return total + ''
            }
        }, '') 

        if(((board[0][0] === board[1][1] && board[0][0] === board[2][2])
        || (board[2][0] === board[1][1] && board[2][0] === board[0][2]))
        && board[1][1] !== ' '){
            res = board[1][1]
        }


    
        return res

}