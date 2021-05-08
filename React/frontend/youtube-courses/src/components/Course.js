
import React from "react";
import {
    Card, CardText,
    CardTitle, Button, Container
} from "reactstrap";

const Course = ({course}) => {
    return (
                <Card body className={"text-center"}>
                    <CardTitle tag="h5"> {course.title} </CardTitle>
                    <CardText> {course.description} </CardText>
                    <Container>
                        <Button color="warning">Update</Button>
                        <Button color="danger" style={{marginLeft:10}}>Delete</Button>
                    </Container>
                </Card>
    );
}
export default Course;