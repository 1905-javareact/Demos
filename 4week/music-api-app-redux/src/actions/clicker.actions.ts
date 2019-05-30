export const clickerTypes = {
    INCREMENT_CLICKS: 'CLICKER_INCREMENT_CLICKS'

}

//this action is an example of a thunk
//a thunk is a two part function, the first part takes in your params
//the second part takes the param dispatch which we can use to send data to the reducer
export const incrementClicks = (inc:number) => (dispatch) =>{
    dispatch({
        payload:{
            clicks:inc
        },
        type: clickerTypes.INCREMENT_CLICKS
    })
}