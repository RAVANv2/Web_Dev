import React from 'react';

class Parent extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            data : "Data from Parent"
        }
    }
    render() {
        const data = this.state.data;
        return(
            <div>
                <Child dataParentToChild={data} />
            </div>
        )
    }
}

class Child extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            data : this.props.dataParentToChild
        }
    }
    render() {
        const data = this.state.data;
        return (
            <div>
                <h2>{data}</h2>
            </div>
        )
    }
}

export default Parent;