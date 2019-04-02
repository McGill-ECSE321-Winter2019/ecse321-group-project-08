import axios from 'axios'
import Vue from 'vue'
import Router from 'vue-router'
import Axios from 'axios';

Vue.use(Router)


var config = require('../../config')


var AXIOS = axios.create({
  baseURL: config.backendUrl,
  headers: { 'Access-Control-Allow-Origin': config.frontendUrl }
})

export default {
  name: 'ConfirmStudentStart',
  data() {
    return {
      startConfirmation: [],
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
  ///StartConfirmation/111?evaluationDate=2020-20-22&employerID=111?coopPositionID=111?studentID=111
  methods: {
    createStartConfirmation: function () {
      this.errors = []
      console.log('edgar')
      var random = Math.trunc(Math.random() * 100000000)
      //mydate = this.evaluationDate.getFullYear() + '-' + (this.evaluationDate.getMonth() + 1) + '-' + this.evaluationDate.getDate()
      AXIOS.post('/StartConfirmation/' + random + "?evaluationDate=" + this.evaluationDate + "&coopPositionID=" + this.irmakselected.id + "&studentID=" + this.irmakselected.student + "&employerID=" + this.employerID, {}, {})

        .then(response => {
          this.startConfirmation.push(response.data)
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
    },
    confirm: function () {
      window.alert("Success! Student's Coop Position is confirmed :) ")
    }

  }
}


