
import axios from "axios";
import { BACKEND_URL } from "../../constants/url";
import { ADD_TO_CART, REMOVE_ITEM, SUB_QUANTITY, ADD_QUANTITY, ADD_SHIPPING, GET_PRODUCTS } from './action-types/cart-actions'

//add shipping action
export const addShipping= (id)=>{
    return{
        type: ADD_SHIPPING,
        id
    }
}

//add cart action
export const addToCart= (id)=>{
    return{
        type: ADD_TO_CART,
        id
    }
}
//remove item action
export const removeItem=(id)=>{
    return{
        type: REMOVE_ITEM,
        id
    }
}
//subtract qt action
export const subtractQuantity=(id)=>{
    return{
        type: SUB_QUANTITY,
        id
    }
}
//add qt action
export const addQuantity=(id)=>{
    return{
        type: ADD_QUANTITY,
        id
    }
}

export const getProducts = () => async dispatch => {
    try {
  
        // dispatch({
        //     type: START_LOADING,
        //     payload: true
        //   });
        //debugger;
        
      const response = await axios({
        method: "get",
        url: BACKEND_URL,
        timeout: 3000,
        headers: {},
        data: {}
      });

      console.log('response',response.data.data);

      dispatch({
        type: GET_PRODUCTS,
        payload: response.data.data
      });
    } catch (error) {
      console.log( `Houston we have a problem: ${error.message}`, error);
    //   dispatch({
    //     type: SET_ERROR,
    //     payload: 'Sorry, please try again later.'
    //   });
    }
  };
