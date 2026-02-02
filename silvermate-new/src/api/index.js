import axios from 'axios';

// 创建 axios 实例
const api = axios.create({
  baseURL: '/api', // 对应接口文档路径前缀
  timeout: 5000
});

// 接口文档 3.1 用户登录
export const login = (data) => api.post('/user/login', data);

// 接口文档 4.1 查询关联老人信息
export const getElderList = (childId) => api.get('/relation/elder/list', { params: { childId } });

// 接口文档 5.2 查询健康记录
export const getHealthList = (userId) => api.get('/health/list', { params: { userId } });

// 接口文档 8.1 AI 语音交互
export const sendAIChat = (data) => api.post('/ai/chat', data);

export default api;