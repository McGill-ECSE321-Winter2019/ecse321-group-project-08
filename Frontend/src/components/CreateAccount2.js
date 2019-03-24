import axios from 'axios'
var config = require('../../config')

var frontendUrl = 'http://' + config.dev.host + ':' + config.dev.port
var backendUrl = 'http://' + config.dev.backendHost + ':' + config.dev.backendPort

var AXIOS = axios.create({
  baseURL: backendUrl,
  headers: { 'Access-Control-Allow-Origin': frontendUrl }
})


function EmployerDto (employerID, username, password, company) {
  this.employerID = employerID
  this.username = username
  this.password = password
  this.company = company
}


export default {
  name: 'employerRegistation',
  data () {
    return {
      employer: [],
      newEmployer: '',
      errorEmployer: '',
      response: []
    }
  },

  //localhost:8080/Employer/111?username=person1&password=123&company=google
  methods: {
    createEmployer: function (employerID, username, password, company) {
 //     AXIOS.post(`/Employer/`+employerID, {}, {})
      //Create a new person and add it to the list of people
      var p = new EmployerDto(employerID, username, password, company)
      this.employer.push(p)
      // Reset the name field for new people
      this.newEmployer = ''
    }
  }
}



























