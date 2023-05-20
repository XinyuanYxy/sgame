<template>
  <div>bot name: {{ bot_name }}</div>
  <div>bot rating: {{ bot_rating }}</div>
  <router-view />
</template>

<script>
import $ from "jquery";
import { ref } from "vue";

export default {
  name: "app",
  setup: () => {
    let bot_name = ref("");
    let bot_rating = ref("");

    $.ajax({
      url: "http://localhost:3000/pk/getbotinfo/",
      type: "get",
      success: (res) => {
        bot_name.value = res.name;
        bot_rating.value = res.rating;
      },
    });

    return {
      bot_name,
      bot_rating,
    };
  },
};
</script>

<style>
body {
  background-image: url("@/assets/pic.jpg");
  background-size: cover;
  background-repeat: no-repeat;
  height: 100%;
  background-position: center;
}
body,
html {
  height: 100%;
}
</style>
