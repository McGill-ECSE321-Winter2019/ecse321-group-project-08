<template>
  <div id="loginpage">
    <h1 align = "center">
      Login
    </h1>
    <form
    id="loginForm"
    @submit="loginEmployer"
    action="javascript:void(0);">
    <p v-if="errors.length">
    <p v-for="error in errors"><b>{{ error }} </b></p>
    </p>
    <p>
            <label for="number"> Employer ID </label>
            <input
            type="number"
            name="number"
            v-model="number"
            id="number"
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
