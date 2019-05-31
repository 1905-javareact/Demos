import Axios from "axios";

//this is just instead of fetch
const chuckNorrisApiClient = Axios.create({
    baseURL: 'http://api.icndb.com/jokes'
})

export const chuckNorrisClient = {
    async randomJoke() {
        let response = await chuckNorrisApiClient.get('/random?limitTo=[nerdy]')
        return response.data.value.joke
    }

}