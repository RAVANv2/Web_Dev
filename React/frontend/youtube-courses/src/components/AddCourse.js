import {Fragment, useEffect, useState} from "react";
import React from "react";
import {Form, FormGroup, Input, Button, Container} from "reactstrap";
import axios from "axios";
import base_url from "../api/bootapi";
import {toast} from "react-toastify";

const AddCourse = () => {
    useEffect( ()=>{
        document.title = "Add Course"
    },[] )

    const [course, setCourse] = useState({})

    // Form Handler Function
    const handleForm = (e) => {
        e.preventDefault()
        postDataToServer(course)
        console.log(e)
    }

    // Creating function to post data to server
    const postDataToServer = (data) => {
        console.log(data)
        axios.post(`${base_url}/add-course`, data).then(
            (response) => {
                toast.success("New Course Added", {
                    position:"bottom-center"
                })
            },
            (error) => {
                toast.error("Something went wrong", {
                    position:"bottom-center"
                })
            }
        )
    }

    return (
        <Fragment>
            <h1 className="text-center my-3" > Fill Course Details </h1>
            <Form onSubmit={handleForm}>
                <FormGroup>
                    <label for="userId"> Course Id </label>
                    <Input type={"text"}
                    placeholder="Enter Here"
                           name={"userId"}
                           id={"userId"}
                           onChange={ (e) => {
                               setCourse({...course, id: e.target.value})
                           } }
                    />
                </FormGroup>

                <FormGroup>
                    <label for={"title"}> Course Title </label>
                    <Input type={"text"} placeholder="Enter Title Here" id="title"
                        onChange={ (e) => {
                            setCourse({...course, title:e.target.value})
                        } }
                    />
                </FormGroup>

                <FormGroup>
                    <label for={"description"}> Course Description </label>
                    <Input type={"textarea"} placeholder="Enter Description Here" id="description"
                    style={ {height:150} }
                           onChange={ (e) => {
                               setCourse({...course, description:e.target.value})
                           } }
                    />
                </FormGroup>

                <Container className="text-center my-3">
                    <Button type="submit" color={"success"}> Add Course </Button>
                    <Button color={"warning"} style={{marginLeft:10}}> Clear </Button>
                </Container>

            </Form>
        </Fragment>
    )
}

export default AddCourse;