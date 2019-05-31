import axios from 'axios'


//base http request
export const musicApiClient = axios.create({
    baseURL: 'http://localhost:9050',
    headers:{
        'Content-Type': 'application/json'
    },
    withCredentials: true
}
)

