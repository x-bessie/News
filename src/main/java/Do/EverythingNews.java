package Do;

import entity.EverythingApiConfig;
import utils.HttpRequestUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Everyting
 * 关键词的检索
 */
public class EverythingNews {
    public static EverythingApiConfig everythingApiConfig = new EverythingApiConfig();

    public void getEveryP(String q) {
        HttpRequestUtil httpRequestUtil = new HttpRequestUtil();

        try {
            String everything_url = everythingApiConfig.getHome();

            Map<String, String> map = new HashMap<String, String>();
            map.put("q", q);
            map.put(everythingApiConfig.getApiKey(), "2c2b3417e7584cb2abcf19564789864d");
            map.put(everythingApiConfig.getLanguage(), "zh");
            map.put(everythingApiConfig.getPageSize(), "100"); //默认20条
            httpRequestUtil.HttpsGetData(everything_url, map);
            httpRequestUtil.Do();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        EverythingNews everythingNews = new EverythingNews();
        System.out.println("请输入搜索关键词");
        Scanner scan = new Scanner(System.in);
        String SearchWord=scan.next();
        if (SearchWord != null) {
            everythingNews.getEveryP(SearchWord);
        }
    }
}
