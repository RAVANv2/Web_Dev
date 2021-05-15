import React from "react";
import {Button} from "reactstrap";


class Greet extends React.Component {
    constructor(props){
        super(props);
        this.state = {value:"Harsh", counter:1}
    }
    changeValue = () => {
        if(this.state.counter === 1){
            this.setState(
                {value:`${this.state.value} Chauhan`, counter:2}
            )
        }else{
            this.setState(
                {value:"Harsh Chauhan", counter:2}
            )
        }

    }
    render() {
        return(
            <div>
                <h1> Hello {this.state.value}</h1>
                <Button type={"button"} onClick={this.changeValue} > Change Value </Button>
            </div>
        )
    }
}
export default Greet;