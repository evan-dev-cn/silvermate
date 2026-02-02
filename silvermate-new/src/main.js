import { createApp } from 'vue'
import App from './App.vue'
import router from './router' // 这里的 ./router 对应你的 router.js 文件

const app = createApp(App)

// 顺序非常重要：先安装插件，再挂载页面
app.use(router) 
app.mount('#app')