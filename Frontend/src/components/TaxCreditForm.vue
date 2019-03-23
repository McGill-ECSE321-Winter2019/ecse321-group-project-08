<template>
<div id="createTaxCreditForm">
<h2> 
Create Tax Credit Form
</h2>
<table align=center>
<tr>
<td>Select Coop Position</td>
</td>
<td>
<input type="number" placeholder="Coop Position" v-model="coopPosition">
</td>
</tr>
<tr>
<td>Tax Credit URL</td>
<td>
<input type="text" placeholder="Tax Credit URL" v-model="TaxCreditURL">
</td>
</tr>


<tr>
<td></td>
<td>
<button @click="createEmployer(coopPosition,TaxCreditURL)" >Create Form</button>
</td>
</tr>
</table>
</div>
</template>
<style>
</style>
<script>
</script>

