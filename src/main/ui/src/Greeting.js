import React, {Component} from 'react';
import axios from "axios";


class Greeting extends Component {
    constructor(props) {
        super(props);
        this.state = {
            error: null,
            message: "",
            isLoaded: false
        };
    }

    componentDidMount() {
        axios.get('http://localhost:8080/api/greeting')
            .then(response => {
                console.log(response)
                this.setState({
                    isLoaded: true,
                    message: response.data
                });
            }).catch(error => {
                console.log(error)
            this.setState({
                isLoaded: true,
                error
            });
        })

    }


    render() {
        const {error, isLoaded, message} = this.state;

        if (error) {
            return <div>Error: {error.message}</div>;
        } else if (!isLoaded) {
            return <div>Loading...</div>;
        } else {
            return (
                <div>
                    <p>Message: {message}</p>
                </div>
            );
        }
    }
}

export default Greeting;
