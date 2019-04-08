import axios from 'axios'
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

var config = require('../../config')


var AXIOS = axios.create({
  baseURL: config.backendUrl,
  headers: { 'Access-Control-Allow-Origin': config.frontendUrl }
})

export default {
  name: 'ConfirmCompletion',
  data() {
    return {
      confirmCompletion: [],
      newStartConfirmation: '',
      errorStartConfirmation: '',
      employerID: null,
      evaluationDate: null,
      coopPositionID: null,
      studentID: null,
      response: [],
      errors: [],
      opps: false,
      irmaklist: [],
      irmakselected: ''
    }
  },
  created: function () {
    this.employerID = this.$route.params.employerID;
    this.updateIrmakList();
    // populate the coopPosition array by querying the database for cooposition matching the employerID
  },

  methods: {
    downloadCoopPlacementForm: function () {
      this.errors = []

      var random = Math.trunc(Math.random() * 100000000)
      //mydate = this.evaluationDate.getFullYear() + '-' + (this.evaluationDate.getMonth() + 1) + '-' + this.evaluationDate.getDate()
      AXIOS.post('/CoopPlacementForm' + "?employerID=" + this.employerID + "&coopPositionID" + this.coopPositionID, {}, {})

        .then(response => {
          this.confirmCompletion.push(response.data)
          this.newStartConfirmation = ''
          this.errorStartConfirmation = ''
          console.log(response.data)
        })
        .catch(e => {
          var errorMsg = e.message;
          this.errors.push(e.message);
          console.log(errorMsg);
          this.errors.push("Username is required");
        });
    },
    mashood_debug: function () {
      console.log("hello");
    },
    redirect: function () {
      var items = [
        "https://drive.google.com/file/d/1iG0ouKfKPECyIm-wLkfSM718Wyns4CQU/view?usp=sharing",
        "https://drive.google.com/file/d/1ICpNlUtnT3AC5RoCE8HzbD_SZfafvgzO/view?usp=sharing",
        "https://drive.google.com/file/d/1SI6gsaL_u8GIHhJ32XZ04qGSZz3OALfO/view?usp=sharing"
      ]
      window.open(items[Math.floor(Math.random() * items.length)]);
      return false;
    },
    updateIrmakList: function () {
      console.log('elias')
      AXIOS.get('/irmak/' + this.employerID, {}, {})
        .then(response => {
          this.irmaklist = response.data
          console.log(this.irmaklist)
        })
        .catch(e => {
          var errorMsg = e.message;
          this.errors.push(e.message);
          console.log(errorMsg + 'here');
          this.errors.push("irmak endpoint did not work");
        })
    }
  }
}













