export const ticTacToeTypes = {
    CELL_CLICK: 'TIC_TAC_TOE_CELL_CLICK'
}


export const clickTTT = (row:number, column:number) => (dispatch)=>{

    dispatch({
        payload:{
            row,
            column
        },
        type: ticTacToeTypes.CELL_CLICK
    })

}
