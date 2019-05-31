import React, { Component } from 'react';
import { connect } from 'react-redux';
import { IState } from '../../reducers';
import {clickTTT} from '../../actions/tictactoe.actions'

interface ITicTacToeProps {
    board:string[][]
    winner: string
    clickTTT: (row:number, column:number)=> void
}


export class TicTacToeComponent extends Component<ITicTacToeProps> {
    
    componentDidUpdate(){
        console.log('updated');
        
    }
    render() {
        return (
            <div>
                <table>
                    <tbody>
                    <tr>
                        <td className='tic-tac-toe' onClick={()=>this.props.clickTTT(0,0)}>
                            {this.props.board[0][0]}
                        </td>
                        <td className='tic-tac-toe' onClick={()=>this.props.clickTTT(0,1)}>
                            {this.props.board[0][1]}
                        </td>
                        <td className='tic-tac-toe' onClick={()=>this.props.clickTTT(0,2)}>
                            {this.props.board[0][2]}
                        </td>
                    </tr>
                    <tr>
                        <td className='tic-tac-toe' onClick={()=>this.props.clickTTT(1,0)}>
                            {this.props.board[1][0]}
                        </td>
                        <td className='tic-tac-toe' onClick={()=>this.props.clickTTT(1,1)}>
                            {this.props.board[1][1]}
                        </td>
                        <td className='tic-tac-toe' onClick={()=>this.props.clickTTT(1,2)}>
                            {this.props.board[1][2]}
                        </td>
                    </tr>
                    <tr>
                        <td className='tic-tac-toe' onClick={()=>this.props.clickTTT(2,0)}>
                            {this.props.board[2][0]}
                        </td>
                        <td className='tic-tac-toe' onClick={()=>this.props.clickTTT(2,1)}>
                            {this.props.board[2][1]}
                        </td>
                        <td className='tic-tac-toe' onClick={()=>this.props.clickTTT(2,2)}>
                            {this.props.board[2][2]}
                        </td>
                    </tr>
                    </tbody>
                </table>
                <p>{this.props.winner}</p>
            </div>
        );
    }
}

const mapStateToProps = (state:IState) => {
    return {
        board: state.ticTacToe.board,
        winner: state.ticTacToe.winner
    }
}

const mapDispatchToProps = {
    clickTTT
}



export default connect(mapStateToProps, mapDispatchToProps)(TicTacToeComponent)