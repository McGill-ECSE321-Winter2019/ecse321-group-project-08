import axios from 'axios'
var config = require('../../config')

var frontendUrl = 'http://' + config.dev.host + ':' + config.dev.port
var backendUrl = 'http://' + config.dev.backendHost + ':' + config.dev.backendPort

var AXIOS = axios.create({
  baseURL: backendUrl,
  headers: { 'Access-Control-Allow-Origin': frontendUrl }
})


function EmployerLoginDto (employerID ) {
  this.employerID = employerID
}


export default {
  name: 'employerLogin',
  data () {
    return {
      employer: [],
      newEmployer: '',
      errorEmployer: '',
      response: []
    }
  },
  // created: function () {
  //   // Test data
  //   const p1 = new EmployerLoginDto(1223)
  //   // Sample initial content
  //   this.employer = [p1]
  // },
  methods: {
    loginEmployer: function (employerID) {
      //Create a new person and add it to the list of people
      var p = new EmployerLoginDto(employerID)
      this.employer.push(p)
      // Reset the name field for new people
      this.newEmployer = ''
    }
  }
}




























