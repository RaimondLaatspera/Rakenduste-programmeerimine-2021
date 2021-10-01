import './navbar.css'
import { Link } from 'react-router-dom';

function Navbar(){
    return (
        <div className="navbar">
            <Link to="/">
                <img className="banner" src="Webstore.jpg" alt="banner"/>
            </Link>
            <Link to="cart">
                <img className="cartico" src="cart.jfif" alt="shopping cart"/>
            </Link>
        </div>
    )
}

export default Navbar;