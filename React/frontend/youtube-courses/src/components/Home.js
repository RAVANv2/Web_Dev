import React from "react";
import {Jumbotron, Button} from "reactstrap";

const Home = () => {
    return (
     <div style={ {padding:30, backgroundColor:"#F2F3F4"} }>
        <Jumbotron className={"text-center"}>
            <h1 className="display" >Learncodewith Harsh</h1>
            <p className="lead"> I Design this course for all <b>React</b> beginners </p>
            <Button color={"primary"} > Start Learning </Button>
        </Jumbotron>
     </div>
    );
};
export default Home;
