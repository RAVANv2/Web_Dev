
import React, {useState, useEffect} from "react";
import Course from "./Course";
import base_url from "../api/bootapi";
import axios from "axios";
import {toast} from "react-toastify";

const Allcourse=()=>{
    useEffect( ()=>{
        document.title = "All Course"
    },[] )

    // Function to call server
    const getAllCourses = () => {
        axios.get(`${base_url}/course`).then(
            (response)=>{
                // Success
                setCourses(response.data)
                toast.success("Course has been loaded",{
                    position:"bottom-center"
                })
            },
            (error) => {
                // Error
                console.log(error)
                toast.error("Something went wrong", {
                    position:"bottom-center"
                })
            }
        )
    }
    const [courses, setCourses] = useState([]);

    // Calling locading course function
    useEffect(() => {
        getAllCourses();
    }, []);

    return(
        <div>
            {
                courses.length > 0
                    ?
                    courses.map( (item) => <Course key={item.id} course={item}/>)
                    :
                    ""
            }
        </div>
    )
}

export default Allcourse;