import { createRouter, createWebHistory } from 'vue-router'

const routes = [
  { path: '/login', component: () => import('./views/Login.vue') },
  {
    path: '/',
    component: () => import('./layout/MainLayout.vue'), // 包含导航栏的布局
    redirect: '/home',
    children: [
      { path: 'home', component: () => import('./views/Home.vue') },
      { path: 'health-add', component: () => import('./views/HealthAdd.vue') },
      { path: 'medication', component: () => import('./views/Medication.vue') },
      { path: 'alerts', component: () => import('./views/Alerts.vue') }
    ]
  }
]

export default createRouter({
  history: createWebHistory(),
  routes
})