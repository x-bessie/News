package entity;

public class ClassifiyNews {
    //API请求链接
    private String home = "http://v.juhe.cn/toutiao/index";

    //类型：top(头条，默认),shehui(社会),guonei(国内),guoji(国际),
    // yule(娱乐),tiyu(体育)junshi(军事),keji(科技),caijing(财经),shishang(时尚)
//    默认为top
    private String type = "type";

    //APPKEY=66c025acfe36f78b483cc1eb2a666abe
    private String key = "key";

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


    @Override
    public String toString() {
        return "ClassifiyNews{" +
                "home='" + home + '\'' +
                ", type='" + type + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
