<template>

<div id="dashboard">
<table id="head" align="left" style="width: 100%">
<tr>
<td>
<h1 align=left id=dashboard1>Welcome Employer</h1>
</td>
<td><h1 align=right id=dashboard1>Employed ID: {{employerID}}</h1></td></tr>
</table>
<ul>
  <li><h5><a class="active"><router-link :to="{ name: 'Dashboard', params: {employerID: employerID} }">Dashboard</router-link></a></h5></li>
  <li><h5><a><router-link :to="{ name: 'ConfirmStudentStart', params: {employerID: employerID} }">Confirm Student Start</router-link></a></h5></li>
  <li><h5><a><router-link :to="{ name: 'ConfirmStudentCompletion', params: {employerID: employerID}}">Confirm Student Completion</router-link></a></h5></li>
  <li><h5><a><router-link :to="{ name: 'DownloadCoopForm', params: {employerID: employerID} }">Download Co-op Placement Form</router-link></a></h5></li>
    <li><h5><a><router-link :to="{ name: 'TaxCreditForm', params: {employerID: employerID} }">Create Tax Credit Form</router-link></a></h5></li>
      <li><h5><a><router-link :to="{ name: 'DownloadTaxCreditForm', params: {employerID: employerID} }">Download Tax Credit Form</router-link></a></h5></li>


</ul>
<table id=body>
<tr>
<tr>
<tr>
</td>
</tr>
</table>
</div>
</template>

<script src="./Dashboard2.js"/>

<style>

#head{background-color:#696969}
#dashboard1{color:white}
#dashborard{padding-left:20px}
h2{color:white}
h2{padding-right:20px}

#progress{
	margin-top:150px;
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
  margin-top:58px;
}

li a {
  display: block;
  color: white;
  padding: 20px 16px;
  text-decoration: none;
 border-color: white;
  
}
li a.active {
  background-color: #4CAF50;
  color: white;
}

li a:hover:not(.active) {
  background-color: #555;
  color: white;
border-color: white;
}
#box1{
  margin-top:200%;
  color:grey;
 border: black;
  }
#body{
  margin-top:30px;
   width: 125%;
}
</style>
