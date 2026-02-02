<template>
  <div style="display: flex;">
    <aside style="width: 200px; background: #333; color: white; height: 100vh;">
      <nav>
        <router-link to="/home" style="color: white; display: block; padding: 10px;">首页</router-link>
        <router-link to="/health-add" style="color: white; display: block; padding: 10px;">录入</router-link>
      </nav>
    </aside>
    <main style="flex: 1; padding: 20px;">
      <router-view />
    </main>
  </div>
</template>