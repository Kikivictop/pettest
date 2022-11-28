import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import chongwuzhaoling from '@/views/modules/chongwuzhaoling/list'
    import news from '@/views/modules/news/list'
    import jiaoxueshipin from '@/views/modules/jiaoxueshipin/list'
    import discusschongwulingyang from '@/views/modules/discusschongwulingyang/list'
    import chongwuzixun from '@/views/modules/chongwuzixun/list'
    import lingyangshenqing from '@/views/modules/lingyangshenqing/list'
    import discusschongwuzixun from '@/views/modules/discusschongwuzixun/list'
    import discussganxiexin from '@/views/modules/discussganxiexin/list'
    import chongwuzhonglei from '@/views/modules/chongwuzhonglei/list'
    import discussjiaoxueshipin from '@/views/modules/discussjiaoxueshipin/list'
    import chongwulingyang from '@/views/modules/chongwulingyang/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discusschongwuzhaoling from '@/views/modules/discusschongwuzhaoling/list'
    import chat from '@/views/modules/chat/list'
    import ganxiexin from '@/views/modules/ganxiexin/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/chongwuzhaoling',
        name: '宠物招领',
        component: chongwuzhaoling
      }
      ,{
	path: '/news',
        name: '通知公告',
        component: news
      }
      ,{
	path: '/jiaoxueshipin',
        name: '教学视频',
        component: jiaoxueshipin
      }
      ,{
	path: '/discusschongwulingyang',
        name: '宠物领养评论',
        component: discusschongwulingyang
      }
      ,{
	path: '/chongwuzixun',
        name: '宠物资讯',
        component: chongwuzixun
      }
      ,{
	path: '/lingyangshenqing',
        name: '领养申请',
        component: lingyangshenqing
      }
      ,{
	path: '/discusschongwuzixun',
        name: '宠物资讯评论',
        component: discusschongwuzixun
      }
      ,{
	path: '/discussganxiexin',
        name: '感谢信评论',
        component: discussganxiexin
      }
      ,{
	path: '/chongwuzhonglei',
        name: '宠物种类',
        component: chongwuzhonglei
      }
      ,{
	path: '/discussjiaoxueshipin',
        name: '教学视频评论',
        component: discussjiaoxueshipin
      }
      ,{
	path: '/chongwulingyang',
        name: '宠物领养',
        component: chongwulingyang
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/discusschongwuzhaoling',
        name: '宠物招领评论',
        component: discusschongwuzhaoling
      }
      ,{
	path: '/chat',
        name: '留言反馈',
        component: chat
      }
      ,{
	path: '/ganxiexin',
        name: '感谢信',
        component: ganxiexin
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
