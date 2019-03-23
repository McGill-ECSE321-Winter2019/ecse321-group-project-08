<template>
<div id="confirmStudentCompletion">
<h2> 
Create Evaluation Form
</h2>
<table align=center>
<tr>
<td>Google Drive URL</td>

<td>
<input type="text" placeholder="URL" v-model="URL">
</td>
</tr>
<tr>

<button @click="createEmployer(newEmployerID,Username,Password)" >Confirm Student Completion</button>
</tr>
</table>
</div>
</template>
<style>
</style>
<script>
</script>

