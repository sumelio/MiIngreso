import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import './index.css'
import cartReducer from './components/reducers/cartReducer';
import { Provider } from 'react-redux';
import { createStore, applyMiddleware } from "redux";
import reduxThunk from "redux-thunk";

const initState = {
    items: [],
    addedItems:[],
    total: 0

}

const store = //createStore(cartReducer);

createStore(
    cartReducer, // Addl reducers
    initState,  // Init state
    applyMiddleware(reduxThunk)); // middleware: ReduxThunk for async

ReactDOM.render(<Provider store={store}><App /></Provider>, document.getElementById('root'));

