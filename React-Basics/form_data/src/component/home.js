import React from 'react'

class Home extends React.Component{
    constructor(props) {
        super(props);
        this.state = {}
    }

    render(){
        console.log(this.props.obj)
        return(
            <div>
                <h1> User Name {this.props.obj.userName} </h1>
                <h1> Description {this.props.obj.description} </h1>
                <h1>Framework {this.props.obj.framework} </h1>
            </div>
        )
    }
}

export default Home;