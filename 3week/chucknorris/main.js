let httpReq
//this is a basic ajax request
function getJoke(){
    httpReq = new XMLHttpRequest()
    if(!httpReq){
        console.log('oops, that\'s not working try again');
        
    }
    httpReq.onreadystatechange = handleStateChangeCNJoke
    httpReq.open('GET', 'http://api.icndb.com/jokes/random?limitTo=[nerdy]', true)
    httpReq.send()

}

function handleStateChangeCNJoke(){
    if(httpReq.readyState === XMLHttpRequest.DONE){
        if(httpReq.status === 200){
            document.getElementById('current-joke').innerText = JSON.parse(httpReq.responseText).value.joke
    
        }else {
            console.log('request failed');
            
        }
    }
}
//using fetch
//fetch is an api built on top of the ajax api
//async and await from es8
async function getJoke2(){
    const response = await fetch('http://api.icndb.com/jokes/random?limitTo=[nerdy]')
    console.log(response);

    const resBody = await response.json()
    document.getElementById('current-joke').innerText = resBody.value.joke
}

//using fetch and .then/.catch from es6
function getJoke3(){
    fetch('http://api.icndb.com/jokes/random?limitTo=[nerdy]').then(resp =>{
        resp.json().then(respBody=>{
            document.getElementById('current-joke').innerText = respBody.value.joke
        })
    }).catch(err =>{
        console.log(err);
        
    })
    
}