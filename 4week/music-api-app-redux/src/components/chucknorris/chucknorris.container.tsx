import { connect } from "react-redux";
import { ChuckNorrisComponent } from "./chucknorris.component";
import { IState } from "../../reducers";
import {buyJoke} from "../../actions/chuck-norris.actions"
//import {incrementClicks} from "../../actions/clicker.actions"


const mapStateToProps = (state:IState) => {
    return {
        currentJoke: state.chuckNorris.currentJoke,
        clicks: state.clicker.clicks,
        buyingJoke: state.chuckNorris.buyingJoke
    }

}

const mapDispatchToProps = {
    buyJoke,
    //incrementClicks
}

export default connect(mapStateToProps, mapDispatchToProps)(ChuckNorrisComponent)