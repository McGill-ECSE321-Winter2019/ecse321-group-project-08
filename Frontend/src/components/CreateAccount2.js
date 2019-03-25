import axios from 'axios'
var config = require('../../config')

var frontendUrl = 'http://' + config.dev.host + ':' + config.dev.port
var backendUrl = (config.dev.backendPort == "443"? 'https://' : "http://") + config.dev.backendHost + (config.dev.backendPort == "443"? (':' + config.dev.backendPort) : "");

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

window.helloWorld = function(){
  console.log("Hello world");
}


export default {
  name: 'createaccount',
  data(){ return {
      employer: [],
      newEmployer: '',
      errorEmployer: '',
      username: null,
      password: null,
      number: null,
      company: null,
      response: [],
      errors: []
  }
  },

  //localhost:8080/Employer/111?username=person1&password=123&company=google
  methods: {
    createEmployer: function (employerID, username, password, company) {
      this.errors = [];
      AXIOS.post('/Employer/'+employerID +"?username=" + username + "&password=" + password + "&company=" +company, {}, {})

      .then(response => {
        this.employer.push(response.data)
        this.newEmployer= ''
        this.errorEmployer= ''
      })
      .catch(e => {
        var errorMsg = e.message
        this.errors.push(e.message);
        console.log(errorMsg);
      });

      //Create a new person and add it to the list of people
      // var p = new EmployerDto(employerID, username, password, company)
      // this.employer.push(p)
      // // Reset the name field for new people
      // this.newEmployer = ''
    },
    /**
     * Function for form input validation.
     * This function proceeds with HTTP call if no errors are found.
     * Otherwise returns.
     * e is the document event (that is generated on submit button click)
     */
    checkForm: function(e){
      var oops = false
      if(!this.username){ this.errors.push("Username is required"); oops=true;}
      if(!this.password){ this.errors.push("Password is required"); oops=true;}
      if(!this.number){ this.errors.push("Employer ID is required"); oops=true;}
      if(!this.company){ this.errors.push("Company is required"); oops=true;}

      // This prevents the default action of the event from being executed!
      e.preventDefault();

      if(oops){return;}
      else {this.createEmployer(this.number, this.username, this.password, this.company);}

    }
  }
}



























