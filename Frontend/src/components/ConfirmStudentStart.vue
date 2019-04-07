<template>
  <div id="dashboard">
    <table id="head" align="left" style="width: 100%">
      <tr>
        <td>
          <h1 align="left" id="dashboard1">Welcome Employer</h1>
        </td>
        <td>
          <h1 align="right" id="dashboard1">Employer ID: {{employerID}}</h1>
        </td>
      </tr>
    </table>
    <ul>
      <li>
        <h5>
          <a>
            <router-link :to="{ name: 'Dashboard', params: {employerID: employerID} }">Dashboard</router-link>
          </a>
        </h5>
      </li>
      <li>
        <h5>
          <a class="active">
            <router-link
              :to="{ name: 'ConfirmStudentStart', params: {employerID: employerID} }"
            >Confirm Student Start</router-link>
          </a>
        </h5>
      </li>
      <li>
        <h5>
          <a>
            <router-link
              :to="{ name: 'ConfirmStudentCompletion', params: {employerID: employerID}}"
            >Confirm Student Completion</router-link>
          </a>
        </h5>
      </li>
      <li>
        <h5>
          <a>
            <router-link
              :to="{ name: 'DownloadCoopForm', params: {employerID: employerID} }"
            >Download Co-op Placement Form</router-link>
          </a>
        </h5>
      </li>

      <li>
        <h5>
          <a>
            <router-link
              :to="{ name: 'DownloadTaxCreditForm', params: {employerID: employerID} }"
            >Download Tax Credit Form</router-link>
          </a>
        </h5>
      </li>
    </ul>

    <div id="createAccount">
      <h2>Register Student</h2>
      <form id="createForm" @submit="confirm()" action="javascript:void(0);">
        <p>
          <label for="coopPositionID">Coop Position</label>
          <select v-model="irmakselected" required>
            <option
              v-bind:key="coop.id"
              v-for="coop in irmaklist"
              v-bind:value="coop"
            >{{coop.id}}-{{coop.companyName}}-{{coop.positionName}}</option>
          </select>
        </p>

        <p>
          <label for="studentID">Student ID</label>
          <input
            type="number"
            name="Student ID"
            v-bind:value="irmakselected.student"
            readonly
            id="Student ID"
            placeholder="Student ID"
          >
        </p>

        <p>
          <label for="password">Start Date</label>
          <input
            type="date"
            name="password"
            v-model="evaluationDate"
            id="password"
            placeholder="Start Date"
            required
          >
        </p>

        <p>
          <input type="submit" value="Confirm Start">
        </p>
      </form>
    </div>
  </div>
</template>

<script src="./ConfirmStudentStart2.js"/>

<style>
#head {
  background-color: #696969;
}
#dashboard1 {
  color: white;
}
#dashborard {
  padding-left: 20px;
}
h2 {
  color: white;
}
h2 {
  padding-right: 20px;
}

#progress {
  margin-top: 150px;
}

ul {
  list-style-type: none;
  padding: 0;
  width: 25%;
  background-color: grey;
  position: absolute;
  height: 100%;
  overflow: auto;
  border-color: white;
  margin-top: 58px;
}

li a {
  display: block;
  color: white;
  padding: 20px 16px;
  text-decoration: none;
  border-color: white;
}
li a.active {
  background-color: #4caf50;
  color: white;
}

li a:hover:not(.active) {
  background-color: #555;
  color: white;
  border-color: white;
}
#box1 {
  margin-top: 200%;
  color: grey;
  border: black;
}
#body {
  margin-top: 30px;
  width: 125%;
}
</style>
