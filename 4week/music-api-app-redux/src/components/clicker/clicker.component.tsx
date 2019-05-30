import React, { Component } from 'react';
import { ClickerIncrementerComponent } from './clicker-incrementer/clicker-incrementer.component';
import { incrementClicks } from '../../actions/clicker.actions';
import { connect } from 'react-redux';
import { IState } from '../../reducers';


interface IClickerProps{
    clicks:number
    incrementClicks: (inc:number) => void
}

export class ClickerComponent extends Component<IClickerProps, any > {
    // constructor(props){
    //     super(props)

    // }


    incrementClicks = (inc:number) => {
       this.props.incrementClicks(inc)
    }

    render() {
        let allIncrementers:any[] =[]
        for(let i = 50; i < this.props.clicks; i+=50){
            allIncrementers.push(<ClickerIncrementerComponent key={'+'+(i/50)*100}label={'+'+(i/50)*100} increment = {()=>this.incrementClicks((i/50)*100)}/>)
        }
        return (
            <div>
               <h3>Clicks: {this.props.clicks}</h3>
               <button className='btn btn-primary' onClick={()=>this.incrementClicks(1)}>+1</button>
                <ClickerIncrementerComponent label={'+5'} increment={()=>this.incrementClicks(5)}/>
                {
                    this.props.clicks >= 100 &&
                    allIncrementers
                }
            </div>
        );
    }
}

const mapStateToProps = (state: IState) => {
    return {
        clicks: state.clicker.clicks
    }
}
const mapDispatchToProps = {
    incrementClicks,
}

export default connect(mapStateToProps, mapDispatchToProps)(ClickerComponent)

