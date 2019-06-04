import axios from 'axios'


//base http request
export const musicApiClient = axios.create({
    baseURL: 'http://ec2-18-217-106-247.us-east-2.compute.amazonaws.com:9050',
    headers:{
        'Content-Type': 'application/json'
    },
    withCredentials: true
}
)



