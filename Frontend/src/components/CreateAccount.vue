<template>
<div id="welcomeno">
<h2> 
Create Account
</h2>
<table align=center>
<tr>
<td>Employer ID</td>
</td>
<td>
<input type="number" placeholder="Employer ID" v-model="newEmployerID">
</td>
</tr>
<tr>
<td>Username</td>
<td>
<input type="text" placeholder="Username" v-model="Username">
</td>
</tr>
<tr>
<td>Password</td>
<td>
<input type="text" placeholder="Password"v-model="Password">
</td>
<tr>
<td>Company</td>
<td>
<input type="text" placeholder="Company" v-model="Company">
</td>
</tr>
</tr>
<tr>
<td></td>
<td>
<button @click="createEmployer(newEmployerID,Username,Password)" >Create Account</button>
</td>
</tr>
</table>
</div>
</template>
<style>
</style>
<script>
</script>

