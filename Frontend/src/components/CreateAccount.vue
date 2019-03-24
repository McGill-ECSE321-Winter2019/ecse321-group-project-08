<template>
<div id="createAccount">
<h2> 
Create Account
</h2>
<table align=center>
<tr>
<td>Employer ID</td>
</td>
<td>
<input type="number" v-model="employerID" placeholder="Employer ID" >
</td>
 <tr v-for="e in employer" >
      <td>{{ e.employerID }}</td>
      <td>{{ e.username }}</td>
      <td>{{ e.password }}</td>
      <td>{{ e.company }}</td>
  </tr>
</tr>
<tr>
<td>Username</td>
<td>
<input type="text" v-model="username" placeholder="Username" >
</td>
</tr>
<tr>
<td>Password</td>
<td>
<input type="text" v-model="password" placeholder="Password">
</td>
<tr>
<td>Company</td>
<td>
<input type="text" v-model="company" placeholder="Company" >
</td>
</tr>
</tr>
<tr>
<td></td>
<td>
        <button @click="createEmployer(employerID, username,password, company)"><router-link to="/dashboard">Create Account</router-link></button>

<!--<button @click="createEmployer(newEmployerID,Username,Password,Company)" >Create Account</button>-->
</td>
</tr>
</table>
</div>
</template>

<script src="./CreateAccount2.js">
</script>

