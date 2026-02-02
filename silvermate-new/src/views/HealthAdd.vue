<template>
  <div class="card">
    <h2>录入健康记录</h2>
    <form @submit.prevent="handleSubmit">
      <p>指标类型: <input v-model="form.healthType" placeholder="如：血压" /></p>
      <p>指标数值: <input v-model="form.healthValue" placeholder="如：130/85mmHg" /></p>
      <p>记录方式: 
        <select v-model="form.recordWay">
          <option :value="1">手动录入</option>
          <option :value="2">设备同步</option>
        </select>
      </p>
      <button type="submit">提交记录</button>
    </form>
  </div>
</template>

<script setup>
import { ref } from 'vue'
const form = ref({ userId: 2, healthType: '', healthValue: '', recordWay: 1 })
const handleSubmit = () => {
  console.log("提交数据给 /api/health/add:", form.value)
  alert("提交成功 (请查看控制台请求载荷)")
}
</script>