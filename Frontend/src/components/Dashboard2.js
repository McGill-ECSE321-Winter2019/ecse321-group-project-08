import axios from 'axios'
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default {
  name: 'Dashboard',
  data() {
    return {
      employerID: null
    }
  },
  created: function () {
    this.employerID = this.$route.params.employerID;
  },
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
      window.alert("Success! Student's Coop Position is confirmed ")
    }
  }











