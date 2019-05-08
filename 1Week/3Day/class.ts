import {IWrestling} from './interface'

export default class Wrestler implements IWrestling{
    introMusic: string
    catchPhrase: string
    yearsPreforming: number
    finisher():string{
        return 'Stone Cold Stunnin'
    }
    constructor(introMusic: string, catchPhrase:string, yearsPreforming: number){
        this.catchPhrase = catchPhrase
        this.introMusic = introMusic
        this.yearsPreforming = yearsPreforming
    }
}

export let steveAustin = new Wrestler('glass Break', 'and that\'s the bottom line', 20)

console.log(steveAustin.finisher())