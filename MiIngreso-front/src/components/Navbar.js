import React from "react";
import { connect } from "react-redux";
import { Link } from "react-router-dom";
const Navbar = props => {
  console.log("props", props);
  return (
    <nav className="nav-extended">
      <div className="nav-wrapper">
        <a className="brand-logo">
          Mi Ingreso
        </a>

        <ul id="nav-mobile" className="right hide-on-med-and-down">
          <li>
          <Link to="/">Catalogo de Productos</Link>
          </li>
          <li>
          <Link to="/cart"> ({props.items.length}) MI carrito</Link>
          </li>
        </ul>
      </div> 
        <span className="hide-on-med-and-up show-on-medium collection">
          <Link className="collection-item"  to="/">Catalogo de Productos</Link>
          <Link className="collection-item" to="/cart"> ({props.items.length}) MI carrito</Link>
        </span> 
    </nav>
  );
};

//export default Navbar;
const mapStateToProps = state => {
  return {
    items: state.addedItems
  };
};
export default connect(mapStateToProps)(Navbar);
