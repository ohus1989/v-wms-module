<template>
  <div id="app">
    <router-link to="/home">main</router-link>
    <router-link to="/info">info</router-link>
    <!-- convert -->
    <!-- <a href="#/main" class="">main</a> -->
    <router-view></router-view>
    <button v-on:click="getData">
      axios test
    </button>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'App',
  methods:{
    getData(){
      axios.get("/v1/basicbiz/user/").then((res)=>{
        console.log(res);
      })
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
