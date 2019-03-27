import axios from 'axios'
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)


function StartConfirmationDto(startConfirmationID, evaluationDate, coopPositionID, studentID) {
  this.startConfirmationID = startConfirmationID
  this.evaluationDate = evaluationDate
  this.coopPositionID = coopPositionID
  this.studentID = studentID
}

export default {
  name: 'ConfirmStudentStart',
  data() {
    return {
      startConfirmation: [],
      newStartConfirmation: '',
      errorStartConfirmation: '',
      employerID: null,
      startConfirmationID: null,
      evaluationDate: null,
      coopPositionID: null,
      studentID: null,
      response: [],
      errors: [],
      opps: false,
    }
  },
  created: function () {
    this.employerID = this.$route.params.employerID;
    // populate the coopPosition array by querying the database for cooposition matching the employerID
  },
  ///StartConfirmation/111?evaluationDate=2020-20-22&employerID=111?coopPositionID=111?studentID=111
  methods: {
    createStartConfirmation: function (startConfirmationID, evaluationDate, coopPositionID, studentID) {
      this.errors = [];
      var opps = false;
      AXIOS.post('/StartConfirmation/' + startConfirmationID + "?evaluationDate=" + evaluationDate + "&coopPositionID=" + coopPositionID + "&studentID=" + studentID, {}, {})

        .then(response => {
          this.startConfirmation.push(response.data)
          this.newStartConfirmation = ''
          this.errorStartConfirmation = ''
          console.log(response.data)
        })
        .catch(e => {
          var errorMsg = e.message
          this.errors.push(e.message);
          console.log(errorMsg);
          this.errors.push("Username is required"); oops = true;
        });
    }
    // checkForm: function(e){
    //   var oops = false
    //   if(!this.startConfirmationID){ this.errors.push("StartConfirmationID is required"); oops=true;}
    //   if(!this.evaluationDate){ this.errors.push("EvaluationDate is required"); oops=true;}
    //   if(!this.coopPositionID){ this.errors.push("CoopPositionID  is required"); oops=true;}
    //   if(!this.studentID){ this.errors.push("StudentID is required"); oops=true;}

    //   // This prevents the default action of the event from being executed!
    //   e.preventDefault();

    //   if(oops){
    //     return;
    //   }
    //   else {
    //     this.createEmployer(this.employerID, this.username, this.password, this.company); 
    //   }

  }
}


