import React from 'react'
import Home from './home'

class Form extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            userName : '',
            description : '',
            framework : 'Vue',
            visible : false
        }
    }

    handleUserName = (event) => {
        this.setState(
            {userName : event.target.value}
        )
    }

    handleDescription = (event) => {
        this.setState(
            {description : event.target.value}
        )
    }

    handleFramework = (event) => {
        this.setState(
            {framework:event.target.value}
        )
    }

    render(){

        if(this.state.visible === true)
            return <Home obj={this.state}/>

        return(
            <form>
                <div>
                    <label>User Name</label>
                    <input type={"text"} value={this.state.userName} onChange={this.handleUserName}/>
                </div>

                <div>
                    <label>Description</label>
                    <textarea value={this.state.description} onChange={this.handleDescription} />
                </div>

                <div>
                    <lable> Framework </lable>
                    <select value={this.state.framework} onChange={this.handleFramework}>
                        <option value={"React"} > React </option>
                        <option value = {"Angular"}>Angular</option>
                        <option value={"Vue"}> Vue </option>
                    </select>
                </div>

                <div>
                    <button onClick={ () => {
                        this.setState({visible: !this.state.visible});
                    } }> Submit </button>
                </div>

                <div>
                    <label onMouseOver={ () => {
                        this.setState({visible: !this.state.visible})
                    } }> Magic!! </label>
                </div>
            </form>
        )
    }
}
export default Form