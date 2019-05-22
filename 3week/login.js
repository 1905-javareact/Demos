async function login(event){
    event.preventDefault()
    console.log('trying to login')
    const username = document.getElementById('inputUsername').value
    const password = document.getElementById('inputPassword').value

    //in es6 enhanced object literals
    // {
    //     username: username,
    //     password, password
    // }

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

        console.log(response);

        if(response.status === 401){
            document.getElementById('error-message').innerText = 'Invalid Credentials'
        } else if( response.status === 200){
            const user = await response.json()
            console.log(user);
            
        } else {
            document.getElementById('error-message').innerText = 'You Can\'t login right now'
        
        }
        
    } catch(err){
        console.log(err);
        
    }


}