import React from 'react'
import { FirstComponent } from '../firstcomponent/first.component';
import { Link } from 'react-router-dom';

export class SecondComponent extends React.Component {

    //render is one of the lifecycle methods of react
    //render will be called anytime a react component or any data in it changes

    render(){
        return(
            <>
            {//this is how you do comments in tsx
            //this is a fragment
            //its just like a normal html tag but it has no values
            //when this gets rendered the fragment will disappear
            }
                <h3>
                    this is the second component
                </h3>
                <FirstComponent/>
                <Link to='/login'>Login</Link>
            </>
        )
    }
}