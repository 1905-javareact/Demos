import React from 'react';
//import logo from './logo.svg';
import './include/bootstrap'
import './App.css';
// import { FirstComponent } from './components/firstcomponent/first.component';
// import { SecondComponent } from './components/secondcomponent/second.component';
import { SignInComponent } from './components/signin/signin.component';
import { BrowserRouter, Switch, Route } from 'react-router-dom';
import { SecondComponent } from './components/secondcomponent/second.component';


//we can make components in two ways
//we can make function components that return some jsx/tsx
//or we can make class components that have a render function that returns som jsx/tsx
const App: React.FC = () => {
  return (
    <BrowserRouter>
    <div className="App">
      <Switch>
        <Route path='/login' component={SignInComponent}/>
        <Route path='/sc' component={SecondComponent}/>
      </Switch>
    </div>
    </BrowserRouter>
  );
}

export default App;
