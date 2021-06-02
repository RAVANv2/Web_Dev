/*
1. Create a callback function in the parent component.
This callback function will get the data from the child component.

2. Pass the callback function in the parent as a prop to the child component.

3. The child component calls the parent callback function using props.
 */

import React from 'react';

class Parent extends React.Component{
    constructor(props) {
        super(props);
        this.state = {data : ''};
    }
    handleCallBack = (newData) => {
        this.setState( {data : newData} )
    }
    render() {
        const data = this.state.data;
        return (
            <div>
                <Child parentCallBack = {this.handleCallBack} />
                {data}
            </div>
        )
    }
}

class Child extends React.Component{
    constructor(props) {
        super(props);
        this.state = {name : ''}
    }

    onTrigger = () => {
        this.props.parentCallBack(this.state.name);
    }

    handleName = (event) => {
        this.setState({name : event.target.value});
    }

    render() {
        return (
            <div>
                <div>
                    <label> Name </label>
                    <input type={"text"} onChange={this.handleName}/>
                </div>
                <div>
                    <button onClick={this.onTrigger}> Submit </button>
                </div>

            </div>
        )
    }
}

export default Parent;

