import React from 'react'
import { User } from '../../models/user';
import { RouteComponentProps } from 'react-router';
import { connect } from 'react-redux';
import { IState } from '../../reducers';
import { login } from '../../actions/login.actions';

interface ISignInState {
    username: string
    password: string
}

interface ISignInProps extends RouteComponentProps{
    currentUser: User
    errorMessage: string
    login: (username:string, password:string, history)=>void
}


export class SignInComponent extends React.Component<ISignInProps, ISignInState>{//first is props second is state
    constructor(props){
        super(props);
        this.state = {
            username: '',
            password: '',
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

    

    loginSubmit = (event) =>{
        event.preventDefault()
        this.props.login(this.state.username, this.state.password, this.props.history)
    }

    componentDidMount(){
        console.log(this.props)
    }

    render(){
        return (
            <form className="form-signin text-center" onSubmit={this.loginSubmit}>
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
                <p>{this.props.errorMessage}</p>
                <button className="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                <p className="mt-5 mb-3 text-muted">&copy; 2017-2019</p>
            </form>
        )
    }
}
//this is the state that this component will care about and have access to
const mapStateToProps = (state:IState) =>{
    return {
        currentUser: state.login.currentUser,
        errorMessage: state.login.errorMessage
    }
}
//this is the actions that will be availible to the component
const mapDispatchToProps = {
    login : login
}


//this will make a higher order component
export default connect(mapStateToProps, mapDispatchToProps)(SignInComponent)