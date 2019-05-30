import React from 'react'

interface ISignInState {
    username: string
    password: string
    errorMessage: string
}

export class SignInComponent extends React.Component<any, ISignInState>{//first is props second is state
    constructor(props){
        super(props);
        this.state = {
            username: '',
            password: '',
            errorMessage: ''
        }
    }


    updateUsername = (event) => {
        console.log(event)
        this.setState({
            username: event.target.value
        })
    }

    updatePassword = (event)=>{
        this.setState({
            password: event.target.value
        })
    }

    

    login = async (event)=>{
        event.preventDefault()
        console.log('trying to login')
        const username = this.state.username
        const password = this.state.password
    
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
                this.setState({
                    errorMessage:'Invalid Credentials'
                })
            } else if( response.status === 200){
                const user = await response.json()
                this.props.history.push('/nested')
                
            } else {
                document.getElementById('error-message').innerText = 'You Can\'t login right now'
            }        
        } catch(err){
            console.log(err);        
        }
    }

    componentDidMount(){
        console.log(this.props)
    }

    render(){
        return (
            <form className="form-signin text-center" onSubmit={this.login}>
                <img className="mb-4" src="/docs/4.3/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72"/>
                <h1 className="h3 mb-3 font-weight-normal">Please sign in</h1>
                <label htmlFor="inputUsername" className="sr-only">Username</label>
                <input type="text" id="inputUsername" className="form-control" value={this.state.username} onChange={this.updateUsername}placeholder="Username" required autoFocus/>
                <label htmlFor="inputPassword" className="sr-only">Password</label>
                <input type="password" id="inputPassword" className="form-control" value={this.state.password} onChange={this.updatePassword} placeholder="Password" required/>
                <div className="checkbox mb-3">
                    <label>
                    <input type="checkbox" value="remember-me"/> Remember me
                    </label>
                </div>
                <p>{this.state.errorMessage}</p>
                <button className="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                <p className="mt-5 mb-3 text-muted">&copy; 2017-2019</p>
            </form>
        )
    }
}