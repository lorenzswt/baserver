var React = require('react');
var client = require('./client');

var App = React.createClass({
    getInitialState: function () {
        return ({students: []});
    },
    componentDidMount: function () {
        client({method: 'GET', path: '/api/students'}).done(response => {
            this.setState({students: response.entity._embedded.students});
        });
    },
    render: function () {
        return (
            <StudentList students={this.state.students}/>
        )
    }
})

var StudentList = React.createClass({
    render: function () {
        var students = this.props.students.map(student =>
            <Student key={student._links.self.href} student={student}/>
        );
        return (
            <table>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Matrikel Nummer</th>
                </tr>
                {students}
            </table>
        )
    }
})

var Student = React.createClass({
    render: function () {
        return (
            <tr>
                <td>{this.props.student.firstName}</td>
                <td>{this.props.student.lastName}</td>
                <td>{this.props.student.matNr}</td>
            </tr>
        )
    }
})

React.render(
    <App />,
    document.getElementById('react')
)