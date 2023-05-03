const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootkw8e1/",
            name: "springbootkw8e1",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootkw8e1/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于安卓开发的饮食搭配APP"
        } 
    }
}
export default base
