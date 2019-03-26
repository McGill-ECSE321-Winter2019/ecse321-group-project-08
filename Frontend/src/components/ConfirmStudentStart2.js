import axios from 'axios'
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default {
    name: 'ConfirmStudentStart',
    data () {
      return {
        employerID: null,
        coopPositions: ['c1','c2','c3']
      }
    },
    created: function () {
        this.employerID= this.$route.params.employerID;
        // populate the coopPosition array by querying the database for cooposition matching the employerID
    } 
  }


