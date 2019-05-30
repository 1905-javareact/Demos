import React, { Component } from 'react';
import { ChuckNorrisComponent } from '../chucknorris/chucknorris.component';

export class NestedComponent extends Component {
    render() {
        return (
            <div>
                <ChuckNorrisComponent maxJokes={10}/>
                <ChuckNorrisComponent maxJokes={100}/>
                <ChuckNorrisComponent maxJokes={0}/>
            </div>
        );
    }
}
