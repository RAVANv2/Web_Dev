
import React, {useState, useEffect} from "react";
import Course from "./Course";
import base_url from "../api/bootapi";
import axios from "axios";

const Allcourse=()=>{
    useEffect( ()=>{
        document.title = "All Course"
    },[] )

    // Function to call server
    const getAllCourses = () => {
        axios.get(`${base_url}/course`).then(
            (response)=>{
                // Success
                console.log(response)
            },
            (error) => {
                // Error
                console.log(error)
            }
        )
    }

    // Calling locading course function
    useEffect(() => {
            getAllCourses();
    }, []);


    const [courses, setCourses] = useState([
        {title:"Java Course", description:"This is Demo course"},
        {title:"Django Course", description:"This is Demo course"},
        {title:"React Course", description:"This is Demo course"}
    ]);

    return(
        <div>
            {
                courses.length > 0
                    ?
                    courses.map( (item) => <Course key={item.id} course={item}/>)
                    :
                    "No Courses"
            }
        </div>
    )
}

export default Allcourse;