import React, { Component } from 'react';

interface IChuckNorrisState{
    joke:string
    maxJokes
}
interface IChuckNorrisProps{
    maxJokes:number
}

export class ChuckNorrisComponent extends Component<IChuckNorrisProps, IChuckNorrisState> {
    //1 in the lifecycle on the first mount we call constructor
    constructor(props){
        super(props)
        this.state = {
            joke: '',
            maxJokes: this.props.maxJokes
        }
        //change the this of the function to being the this of the class
        this.getChuckNorrisJokes = this.getChuckNorrisJokes.bind(this)
    }

//2 to start an update either state has to change which mean setState
// or props of the component have to change
//or we call forceUpdate


    async getChuckNorrisJokes () {
        if(this.state.maxJokes > 0){
            const response = await fetch('http://api.icndb.com/jokes/random?limitTo=[nerdy]')
            console.log(response);
    
            const resBody = await response.json()
            this.setState({
                joke:resBody.value.joke,
                maxJokes: this.state.maxJokes-1
            })
        }
        
    }


   
//1 then we call render
//2 we call a render
    render() {
        this.getChuckNorrisJokes() //don't set state in render or in did update
        //because this will trigger another update making an infinte loop
        const {joke} = this.state
        return (
            <div>
                <p>{joke || 'Waiting on a joke, what a joke'}</p>
                <button className='btn btn-danger' onClick={this.getChuckNorrisJokes}>Get Joke</button>
            </div>

        );
    }
//1 then react modifies the virtual dom
//2 then react modifies the virtual dom

//1 then we call component didmount
    componentDidMount(){
        //we just loaded this component
        //lets go get a joke so we don;t have to use the placeholder text
        this.getChuckNorrisJokes()
    }
    
//2 then we call component did update
    componentDidUpdate(){
        console.log('this is an update');
        
    }
//3 we are leaving the component and it is being destroyed
//we will call willunmount before we destroy it
//
    componentWillUnmount(){
        console.log('About to unmount');
        
    }
}
