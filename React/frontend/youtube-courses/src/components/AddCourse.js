import {Fragment} from "react";
import React from "react";
import {Form, FormGroup, Input, Button, Container} from "reactstrap";

const AddCourse = () => {
    return (
        <Fragment>
            <h1 className="text-center my-3" > Fill Course Details </h1>
            <Form>
                <FormGroup>
                    <label for="userId"> Course Id </label>
                    <Input type={"text"}
                    placeholder="Enter Here"
                           name={"userId"}
                           id={"userId"}
                    />
                </FormGroup>

                <FormGroup>
                    <label for={"title"}> Course Title </label>
                    <Input type={"text"} placeholder="Enter Title Here" id="title"/>
                </FormGroup>

                <FormGroup>
                    <label for={"description"}> Course Description </label>
                    <Input type={"textarea"} placeholder="Enter Description Here" id="description"
                    style={ {height:150} }
                    />
                </FormGroup>

                <Container className="text-center my-3">
                    <Button color={"success"}> Add Course </Button>
                    <Button color={"warning"} style={{marginLeft:10}}> Clear </Button>
                </Container>

            </Form>
        </Fragment>
    )
}

export default AddCourse;