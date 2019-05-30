import React from 'react';
//import logo from './logo.svg';
import './include/bootstrap'
import './App.css';
// import { FirstComponent } from './components/firstcomponent/first.component';
// import { SecondComponent } from './components/secondcomponent/second.component';
import { SignInComponent } from './components/signin/signin.component';
import { BrowserRouter, Switch, Route } from 'react-router-dom';
import { SecondComponent } from './components/secondcomponent/second.component';
import { NavComponent } from './components/nav/nav.component';
import { ArtistComponent } from './components/artistcomponent/artist.component';
import { FirstComponent } from './components/firstcomponent/first.component';
import { ClickerComponent } from './components/clicker/clicker.component';
import { MoviesComponent } from './components/movies/movies.component';
import { NestedComponent } from './components/nested/nested.component';
import { PokemonComponent } from './components/pokemon/pokemon.component';
import { ChuckNorrisComponent } from './components/chucknorris/chucknorris.component';
import { TicTacToeComponent } from './components/tic-tac-toe/tic-tac-toe.component';


//we can make components in two ways
//we can make function components that return some jsx/tsx
//or we can make class components that have a render function that returns som jsx/tsx
const App: React.FC = () => {
  return (
    <BrowserRouter>
    
    <div className="App">
    <NavComponent/>
      <Switch>
        <Route path='/login' component={SignInComponent}/>
        <Route path='/home' component={SecondComponent}/>
        <Route path='/second' component={SecondComponent}/>
        <Route path='/artists' component={ArtistComponent}/>
        <Route path='/first' component={FirstComponent}/>
        <Route path='/clicker' component={ClickerComponent}/>
        <Route path='/movies' component={MoviesComponent}/>
        <Route path='/nested' component={NestedComponent}/>
        <Route path='/pokemon' component={PokemonComponent}/>
        {/*             we use render instead of component to give props in a route  */}
        {/* This is an example of a higher order component That is a component that wraps around another one and adds some functionality */}
        <Route path='/chuck-norris' render={(props)=><ChuckNorrisComponent {...props} maxJokes={10}/>}/>
        <Route path='/tic-tac-toe' component={TicTacToeComponent}/>
        {/* <Route path='/users' component={UserComponent}/>  for testing*/}
      </Switch>
    </div>
    </BrowserRouter>
  );
}

export default App;
