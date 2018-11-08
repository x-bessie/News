package entity;
/*
NewsAPI 的请求参数设置
 */

public class TopApiConfig {
    //请求的主链接
    private String home = "https://newsapi.org/v2/top-headlines";
    //国家
    private String country = "country";
    //查找关键词
    private String q = "q";
    //token=2c2b3417e7584cb2abcf19564789864d
    private String apiKey = "apiKey";
    //   business entertainment general health science sports technology
    private String category = "";

//    返回的条目
//    String pageSize="&pageSize=100";


    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "TopApiConfig{" +
                "home='" + home + '\'' +
                ", country='" + country + '\'' +
                ", q='" + q + '\'' +
                ", apiKey='" + apiKey + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
