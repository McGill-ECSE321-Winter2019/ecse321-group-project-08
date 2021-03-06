import axios from 'axios'
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

var config = require('../../config')

var AXIOS = axios.create({
  baseURL: config.backendUrl,
  headers: { 'Access-Control-Allow-Origin': config.frontendUrl }
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
      employerID: null,
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
        console.log(response.data)
        this.$router.push({name : 'Dashboard', params: {employerID: employerID}});
      })
      .catch(e => {
        var errorMsg = e.message
        this.errors.push(e.message);
        console.log(errorMsg);
      });
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
      if(!this.employerID){ this.errors.push("Employer ID is required"); oops=true;}
      if(!this.company){ this.errors.push("Company is required"); oops=true;}

      // This prevents the default action of the event from being executed!
      e.preventDefault();

      if(oops){
        return;
      }
      else {
        this.createEmployer(this.employerID, this.username, this.password, this.company); 
      }
    }
  }
}



























