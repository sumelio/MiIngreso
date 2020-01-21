import React, { Component } from 'react';
import {BrowserRouter, Route, Switch} from 'react-router-dom'
import Navbar from './components/Navbar'
import Home from './components/Home'
import Cart from './components/Cart'
import { connect } from 'react-redux';
import { getProducts } from './components/actions/cartActions';

class App extends Component {
  async componentDidMount() {
    this.props.getProducts();
  }
  render() {
    return (
       <BrowserRouter>
            <div className="App">
            
              <Navbar/>
                <Switch>
                    <Route exact path="/" component={Home}/>
                    <Route path="/cart" component={Cart}/>
                  </Switch>
             </div>
       </BrowserRouter>
      
    );
  }
}

const mapStateToProps = (state)=>{
  return{
      items: state.addedItems,
      //addedItems: state.addedItems
  }
}

const mapDispatchToProps = {
  getProducts
};

export default connect(mapStateToProps,mapDispatchToProps)(App)