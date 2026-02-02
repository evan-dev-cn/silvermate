<template>
  <div>
    <h2>异常提醒中心</h2>
    
    <div class="alert-box red">
      <h4>⚠️ 服药异常告警</h4>
      <p>记录：降压药 - 2026-02-02 08:00 逾期未服用</p>
    </div>

    <div class="alert-box orange">
      <h4>💡 咨询异常模块</h4>
      <p>风险预警：老人对话中出现高频词“不想活了”、“没意思”</p>
      <button @click="showDetail = !showDetail">查看对话详细</button>
      <div v-if="showDetail" class="detail">
        <p>10:05 老人：我觉得活久了真没意思...</p>
        <p>10:06 AI：大爷，别这么想，今天阳光很好...</p>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'
const showDetail = ref(false)
</script>

<style scoped>
.alert-box { padding: 15px; margin-bottom: 20px; border-left: 5px solid; background: white; }
.red { border-color: red; color: red; }
.orange { border-color: orange; color: #856404; }
.detail { background: #f9f9f9; padding: 10px; margin-top: 10px; border: 1px dashed #ccc; color: #333; }
</style>