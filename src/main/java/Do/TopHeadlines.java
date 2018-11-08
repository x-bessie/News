package Do;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import entity.TopApiConfig;
import utils.HttpRequestUtil;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * TOP-Headlines
 * 关键词的检索
 */
public class TopHeadlines {
    public static TopApiConfig topApiConfig = new TopApiConfig();


    public void getTakeTopicP(String q) {
        HttpRequestUtil httpRequestUtil = new HttpRequestUtil();
        try {
            String top_headline_url = topApiConfig.getHome();
            Map<String, String> map = new HashMap<String, String>();
            map.put("q", q);
            map.put(topApiConfig.getCountry(), "cn");
            map.put(topApiConfig.getApiKey(), "2c2b3417e7584cb2abcf19564789864d");
            httpRequestUtil.HttpsGetData(top_headline_url, map);
            httpRequestUtil.Do();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        TopHeadlines topHeadlines = new TopHeadlines();
        System.out.println("请输入搜索参数");
        Scanner scanner = new Scanner(System.in);

        String search = scanner.next();
//        System.out.println("输入的数据为：" + search);
        if (search != null) {
            topHeadlines.getTakeTopicP(search);
        }
        scanner.close();

    }
}
