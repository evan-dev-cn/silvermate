<template>
  <div style="text-align:center; padding-top:100px">
    <h2>智伴银龄登录</h2>
    <input v-model="acc" placeholder="账号" /><br><br>
    <input v-model="pwd" type="password" placeholder="密码" /><br><br>
    <button @click="login">进入系统</button>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'
const router = useRouter()
const acc = ref('13800000000'); const pwd = ref('123456')
const login = () => { router.push('/home') }
</script>