<template>
<div id="dashboard">
  <table id="head" align="left" style="width: 100%">
    <tr>
      <td>
        <h1 align="left" id="dashboard1">Welcome Employer</h1>
      </td>
      <td>
        <h1 align="right" id="dashboard1">Employed ID: XXXX</h1>
      </td>
    </tr>
  </table>
  <ul>
    <li>
      <h5>
        <a class="active">
          <router-link to="/dashboard">Dashboard</router-link>
        </a>
      </h5>
    </li>
    <li>
      <h5>
        <a>
          <router-link to="/ConfirmStudentStart">Confirm Student Start</router-link>
        </a>
      </h5>
    </li>
    <li>
      <h5>
        <a>
          <router-link to="/ConfirmStudentCompletion">Confirm Student Completion</router-link>
        </a>
      </h5>
    </li>
    <li>
      <h5>
        <a>
          <router-link to="/DownloadCoopForm">Download Co-op Placement Form</router-link>
        </a>
      </h5>
    </li>
    <li>
      <h5>
        <a>
          <router-link to="/TaxCreditForm">Create Tax Credit Form</router-link>
        </a>
      </h5>
    </li>
    <li>
      <h5>
        <a>
          <router-link to="/DownloadTaxCreditForm">Download Tax Credit Form</router-link>
        </a>
      </h5>
    </li>
  </ul>


  <table id="body">
    <tr>
      <th align = "right">
        <h1 >Confirm Student Start</h1>
      </th>
    </tr>

    
      <tr>
        <td align= "center">
          <h4 id = "tasks"> Select a Student</h4>
          <select>
            <option value ="coopposition"> Select a Student</option>
          </select>
        </td>
      </tr>
      <tr>
        <td align = "center">
          <button type = "button"> Confirm Student </button>
        </td>

        
      </tr>
    </table>
</div>
  </template>

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

<script>
</script>

