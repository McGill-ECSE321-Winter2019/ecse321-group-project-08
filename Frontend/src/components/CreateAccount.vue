<template>
<div id="createAccount">
<h2> 
Create Account
</h2>

<form
id="createForm"
@submit="checkForm"
action="javascript:void(0);">
<p v-if="errors.length">
<p v-for="error in errors"> <b>{{ error }} </b></p>
</p>
<p>
        <label for="employerID"> Employer ID </label>
        <input
        type="number"
        name="employerID"
        v-model="employerID"
        id="employerID"
        placeholder="EmployerID">
</p>
<p>
        <label for="username"> Username </label>
        <input
        type="text"
        name="username"
        v-model="username"
        id="username"
        placeholder="Username">
</p>
<p>
        <label for="password"> Password </label>
        <input
        type="password"
        name="password"
        v-model="password"
        id="password"
        placeholder="Password">
</p>
<p>
        <label for="company"> Company </label>
        <input
        type="text"
        name="company"
        v-model="company"
        id="company"
        placeholder="Company">
</p>
<p>
        <input
        type="submit"
        value="submit">
</p>
</form>
</div>
</template>
<script src="./CreateAccount2.js"/>

