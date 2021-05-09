
import React, {useEffect, useState} from "react";
import {
    Card, CardText,
    CardTitle, Button, Container
} from "reactstrap";
import axios from "axios";
import base_url from "../api/bootapi";
import {toast} from "react-toastify";



const Course = ({course}) => {
    const [reload, setReload] = useState( [] )
    const deleteCourse = () => {
        axios.delete(`${base_url}/delete-course/${course.id}`).then(
            (response) => {
                toast.success(`${course.title} is deleted`, {
                    position:"bottom-center"
                })
                setReload("Reload Course")
            },
            (error) => {
                toast.error("Something went wrong", {
                    position:"bottom-center"
                })
            }
        )
    }
    return (
                <Card body className={"text-center"}>
                    <CardTitle tag="h5"> {course.title} </CardTitle>
                    <CardText> {course.description} </CardText>
                    <Container>
                        <Button color="warning">Update</Button>
                        <Button color="danger" onClick= { () => {
                            deleteCourse();
                        } } style={{marginLeft:10}}> Delete</Button>
                    </Container>
                </Card>
    );
}
export default Course;