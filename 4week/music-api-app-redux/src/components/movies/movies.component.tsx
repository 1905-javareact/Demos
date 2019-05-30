import React, { Component } from 'react';
import { User } from '../../models/user';

interface IUserComponentState{
    users:User[]
}


export class UserComponent extends Component<any, IUserComponentState> {
    render() {
        return (
            <div>
                I am the Movies Component
            </div>
        );
    }
}
