
export const loginTypes = {
    INVALID_CREDENTIALS : 'LOGIN_INVALID_CREDENTIALS',
    FAILED_TO_LOGIN: 'LOGIN_FAILED_TO_LOGIN',
    SUCCESSFUL_LOGIN: 'LOGIN_SUCCESSFUL_LOGIN'

}

//this action is an example of a thunk
//a thunk is a two part function, the first part takes in your params
//the second part takes the param dispatch which we can use to send data to the reducer
export const login = (username:string, password:string, history:any) => async(dispatch) =>{
    const credentials = {
        username,
        password
    }

    try{

        const response = await fetch('http://localhost:9050/users/login', {
            method: 'POST',
            credentials: 'include',
            body: JSON.stringify(credentials),
            headers:{
                'content-type': 'application/json'
            }
        })

        if(response.status === 401){//if user pass is wrong
            //send info to the reducer
            dispatch({
                //with a type of INVALID CREDENTIALS
                type: loginTypes.INVALID_CREDENTIALS
            })
        } else if( response.status === 200){
            const user = await response.json()
            dispatch({
                payload:{
                    user: user
                },
                type:loginTypes.SUCCESSFUL_LOGIN
            })
            history.push('/nested')
            
        } else {
            dispatch({
                //with a type of INVALID CREDENTIALS
                type: loginTypes.FAILED_TO_LOGIN
            })
        }        
    } catch(err){
        console.log(err);        
    }


}