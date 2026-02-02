<template>
  <div>
    <h2>服药记录统计</h2>
    <div class="card">
      <h4>近七日服药达成率</h4>
      <div style="height:100px; background:#eee; text-align:center; line-height:100px">
        [此处显示柱状图表：85%]
      </div>
    </div>
    
    <div class="card" style="margin-top:20px">
      <h4>当前服药清单</h4>
      <table border="1" style="width:100%">
        <tr><th>药品名称</th><th>剂量</th><th>计划时间</th><th>状态</th></tr>
        <tr><td>降压药</td><td>1片</td><td>08:00</td><td>已服药</td></tr>
        <tr><td>阿司匹林</td><td>1片</td><td>20:00</td><td>待服用</td></tr>
      </table>
    </div>
  </div>
</template>