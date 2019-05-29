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


    render(){
        return (
            <form className="form-signin text-center">
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