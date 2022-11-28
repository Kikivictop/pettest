const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootf2308/",
            name: "springbootf2308",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootf2308/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "宠物领养平台"
        } 
    }
}
export default base
