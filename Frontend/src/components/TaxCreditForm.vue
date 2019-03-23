<template>
<div id="createTaxCreditForm">
<h2> 
Create Tax Credit Form
</h2>
<table align=center>
<tr>
</td>

<div class="col-md-4">
    <form>
    <h4>Select Coop Position</h4>
    <select class="form-control"  id='firstList' name='firstList' onClick="getFoodItem()">
    </select>
     
    
    </select>
     
    </form>
    </div>
<td>
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

