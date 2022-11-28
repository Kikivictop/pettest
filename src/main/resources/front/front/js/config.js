
var projectName = '宠物领养平台';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '教学视频',
	url: './pages/jiaoxueshipin/list.html'
}, 
{
	name: '宠物招领',
	url: './pages/chongwuzhaoling/list.html'
}, 
{
	name: '宠物资讯',
	url: './pages/chongwuzixun/list.html'
}, 
{
	name: '宠物领养',
	url: './pages/chongwulingyang/list.html'
}, 
{
	name: '感谢信',
	url: './pages/ganxiexin/list.html'
}, 

{
	name: '通知公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springbootf2308/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["新增","查看","修改","删除"],"menu":"宠物种类","menuJump":"列表","tableName":"chongwuzhonglei"}],"menu":"宠物种类管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["新增","查看","修改","删除","查看评论"],"menu":"教学视频","menuJump":"列表","tableName":"jiaoxueshipin"}],"menu":"教学视频管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","修改","删除","审核","查看评论"],"menu":"宠物招领","menuJump":"列表","tableName":"chongwuzhaoling"}],"menu":"宠物招领管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","修改","删除","查看评论"],"menu":"宠物资讯","menuJump":"列表","tableName":"chongwuzixun"}],"menu":"宠物资讯管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除","查看评论"],"menu":"宠物领养","menuJump":"列表","tableName":"chongwulingyang"}],"menu":"宠物领养管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","修改","删除","审核"],"menu":"领养申请","menuJump":"列表","tableName":"lingyangshenqing"}],"menu":"领养申请管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","修改","删除","查看评论"],"menu":"感谢信","menuJump":"列表","tableName":"ganxiexin"}],"menu":"感谢信管理"},{"child":[{"appFrontIcon":"cuIcon-service","buttons":["新增","查看","修改","删除"],"menu":"留言反馈","tableName":"chat"},{"appFrontIcon":"cuIcon-explore","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"通知公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","查看评论"],"menu":"教学视频列表","menuJump":"列表","tableName":"jiaoxueshipin"}],"menu":"教学视频模块"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","查看评论"],"menu":"宠物招领列表","menuJump":"列表","tableName":"chongwuzhaoling"}],"menu":"宠物招领模块"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","查看评论"],"menu":"宠物资讯列表","menuJump":"列表","tableName":"chongwuzixun"}],"menu":"宠物资讯模块"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","查看评论","申请"],"menu":"宠物领养列表","menuJump":"列表","tableName":"chongwulingyang"}],"menu":"宠物领养模块"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","查看评论"],"menu":"感谢信列表","menuJump":"列表","tableName":"ganxiexin"}],"menu":"感谢信模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["新增","查看","修改","删除","查看评论"],"menu":"宠物招领","menuJump":"列表","tableName":"chongwuzhaoling"}],"menu":"宠物招领管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["新增","查看","修改","删除","查看评论"],"menu":"宠物资讯","menuJump":"列表","tableName":"chongwuzixun"}],"menu":"宠物资讯管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","修改","删除"],"menu":"领养申请","menuJump":"列表","tableName":"lingyangshenqing"}],"menu":"领养申请管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除","查看评论"],"menu":"感谢信","menuJump":"列表","tableName":"ganxiexin"}],"menu":"感谢信管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","查看评论"],"menu":"教学视频列表","menuJump":"列表","tableName":"jiaoxueshipin"}],"menu":"教学视频模块"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","查看评论"],"menu":"宠物招领列表","menuJump":"列表","tableName":"chongwuzhaoling"}],"menu":"宠物招领模块"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","查看评论"],"menu":"宠物资讯列表","menuJump":"列表","tableName":"chongwuzixun"}],"menu":"宠物资讯模块"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","查看评论","申请"],"menu":"宠物领养列表","menuJump":"列表","tableName":"chongwulingyang"}],"menu":"宠物领养模块"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","查看评论"],"menu":"感谢信列表","menuJump":"列表","tableName":"ganxiexin"}],"menu":"感谢信模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
