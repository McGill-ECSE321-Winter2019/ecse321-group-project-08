<template>
  <div id="loginpage">
    <h1 align = "center">
      Login
    </h1>

    <table align="center">

      <td align = "center">
        <h4>
          Enter Employer ID
        </h4>
        <input type = "number" size= "25"></input>
        <button><router-link to="/dashboard">Login</router-link></button>

      </td>

      <td>

      </td>


    </table>
  </div>

</template>

<script>
export default {
  name: 'hello',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
</style>
