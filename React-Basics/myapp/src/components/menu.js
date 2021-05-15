import React from 'react';
import {Media} from "reactstrap";


class Menu extends React.Component {
    constructor(props) {
        super(props);
        this.state = {}
        console.log(this.props.obj.places);
        console.log(this.props.obj.test);
    }
    render(){
        const menu = this.props.obj.places.map( (place) => {
            return (
                <div key = {place.id} id={"unit"} className={"col-12 mt-5"}>
                    <Media tag={"li"}>
                        <Media left>
                            <Media object src={place.image} alt={place.name} />
                        </Media>
                        <Media body className={"ml-3"}>
                            <Media heading> <strong>{place.name} {this.props.obj.test}</strong> </Media>
                            <div><strong>Location Type - </strong>{place.category}</div>
                            <div><strong>Info - </strong>{place.description}</div>
                            <div><strong>Info Source - </strong>{place.source}</div>
                        </Media>
                    </Media>
                </div>
            )
        } )
        return(
            <div className={"container"}>
                <div className={"row"}>
                    <Media list>
                        {menu}
                    </Media>
                </div>

            </div>
        )
    }
}

export default Menu;