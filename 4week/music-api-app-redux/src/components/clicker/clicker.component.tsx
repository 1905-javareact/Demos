import React, { Component } from 'react';
import { ClickerIncrementerComponent } from './clicker-incrementer/clicker-incrementer.component';

interface IClickerState{
    clicks:number
}

export class ClickerComponent extends Component<any, IClickerState> {
    constructor(props){
        super(props)
        this.state = {
            clicks:0
        }
    }


    incrementClicks = (inc:number) => {
        this.setState({
            clicks: this.state.clicks + inc
        })
    }

    render() {
        let allIncrementers:any[] =[]
        for(let i = 50; i < this.state.clicks; i+=50){
            allIncrementers.push(<ClickerIncrementerComponent key={'+'+(i/50)*100}label={'+'+(i/50)*100} increment = {()=>this.incrementClicks((i/50)*100)}/>)
        }
        return (
            <div>
               <h3>Clicks: {this.state.clicks}</h3>
               <button className='btn btn-primary' onClick={()=>this.incrementClicks(1)}>+1</button>
                <ClickerIncrementerComponent label={'+5'} increment={()=>this.incrementClicks(5)}/>
                {
                    this.state.clicks >= 100 &&
                    allIncrementers
                }
            </div>
        );
    }
}

