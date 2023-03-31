import "./Header.css";
import { FcShop } from "react-icons/fc";
import { AiOutlineSearch } from "react-icons/ai";

const Header = () => {
  return (
   <div>
    <nav className="navbar">
      <div className="brand">
        <FcShop className="fcshop"/>
        SHOPPERS HUB     
      </div>
      <div className="search_bar">
        <input type="search" placeholder="Search here"></input>
        <AiOutlineSearch className="search_icon" />
      </div>
      <ul className="Headerlogin">
        <li>
          <button className='button'>Login</button>
        </li>
        <li>
          <button className='button'>Add to Cart</button>
        </li>
      </ul>

    </nav>
    </div>

  )
}
export default Header;