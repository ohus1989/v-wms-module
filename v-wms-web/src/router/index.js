import{createWebHistory, createRouter}   from 'vue-router';
import Info from '../views/Info.vue';

const routes = [{
    path: '/',
    redirect: '/home'
}, {
    path: '/home',
    component: () => import('../views/Main.vue'),
}, {
    path: '/info',
    component: Info
}];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;
