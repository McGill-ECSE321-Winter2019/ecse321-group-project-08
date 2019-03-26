<template>
  <div id="loginpage">
    <h1 align = "center">
      Login
    </h1>
    <form
    id="loginForm"
    @submit="checkForm"
    action="javascript:void(0);">
    </p>
    <p>
            <label for="employerID"> Employer ID </label>
            <input
            type="employerID"
            name="employerID"
            v-model="employerID"
            id="employerID"
            placeholder="EmployerID">
    </p>
    <p>
            <input
            type="submit"
            value="submit">
    </p>
    </form>
  </div>

</template>


<script src="./LoginPage2.js">
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
