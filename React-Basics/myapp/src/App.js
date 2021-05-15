import React from 'react'
import './App.css';
import Greet from './components/greet'
import {PLACES} from "./shared/places";
import {Navbar, NavbarBrand} from "reactstrap";
import Menu from "./components/menu";

class App extends React.Component{
    constructor(props) {
        super(props);
        this.state = {places: PLACES, test: "Harsh"};
    }
    render(){
        return (
            <div className="App">
                <Navbar color={"primary"}>
                    <div className={"container"} id={"brand"}>
                        <NavbarBrand>Incredible India</NavbarBrand>
                    </div>
                </Navbar>

                <Greet />
                <h1>Famous Places of India</h1>
                <Menu obj={this.state} />
            </div>
        )
    }
}


export default App;
