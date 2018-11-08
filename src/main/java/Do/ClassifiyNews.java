package Do;

import utils.HttpRequestUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassifiyNews {
    public static entity.ClassifiyNews classifiyNews = new entity.ClassifiyNews();

    public void getClassifiyP(String type) {
        HttpRequestUtil httpRequestUtil = new HttpRequestUtil();
        try {
            String top_headline_url = classifiyNews.getHome();
            Map<String, String> map = new HashMap<String, String>();
            map.put("type", type);
            map.put(classifiyNews.getKey(), "66c025acfe36f78b483cc1eb2a666abe");
            httpRequestUtil.HttpsGetData(top_headline_url,map);
            httpRequestUtil.Do();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        ClassifiyNews classifiyNews = new ClassifiyNews();
        //top(头条，默认),shehui(社会),guonei(国内),guoji(国际),
        //yule(娱乐),tiyu(体育)junshi(军事),keji(科技),caijing(财经),shishang(时尚)
        //默认为top
        System.out.println("输入分类：type");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        classifiyNews.getClassifiyP(type);


    }

}