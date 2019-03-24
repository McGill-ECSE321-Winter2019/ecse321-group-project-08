import axios from 'axios'
var config = require('../../config')

var frontendUrl = 'http://' + config.dev.host + ':' + config.dev.port
var backendUrl = 'http://' + config.dev.backendHost + ':' + config.dev.backendPort

var AXIOS = axios.create({
  baseURL: backendUrl,
  headers: { 'Access-Control-Allow-Origin': frontendUrl }
})


function EmployerDTO (employerID,username,password,company){
    this.employerID = employerID
    this.username= username
    this.password = password
    this.company = company
}

export default {
    name: 'employerRegistration',
    data () {
      return {
        employer: [],
        newEmployer: '',
        errorEmployer: '',
        response: []
      }
    }
  }
  
  methods: {
    createEmployer: function(employerID,username,password,company) {
      // Create a new person and add it to the list of people
      var p = new EmployerDTO(employerID,username,password,company)
      this.employer.push(p)
      // Reset the name field for new people
      this.newEmployer = ''
    }
  }
  
  