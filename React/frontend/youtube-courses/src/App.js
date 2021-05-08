import './App.css';
import React from "react";
import Home from './components/Home';
import Allcourses from "./components/Allcourses";
import AddCourse from './components/AddCourse';
import {ToastContainer} from "react-toastify";
import {Col, Row, Container} from "reactstrap";
import Header from "./components/Header";
import Menus from "./components/Menu";
import {BrowserRouter as Router, Route} from "react-router-dom";

// import Header from './components/header'

function App() {
    return (
        <div>
            <Router>
                <ToastContainer />
                <Header />
                <Container>
                    <Row>
                        <Col md={4}>
                            <Menus />
                        </Col>
                        <Col md={8}>
                            <Route path="/" component={Home} exact />
                            <Route path="/add-course" component={AddCourse} exact />
                            <Route path="/view-courses" component={Allcourses} exact />
                        </Col>
                    </Row>
                </Container>
            </Router>
        </div>
    )
}
export default App;




