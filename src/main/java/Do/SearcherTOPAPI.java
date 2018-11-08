package Do;

import entity.TopApiConfig;
import utils.HttpRequestUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * test
 */
public class SearcherTOPAPI {
    public static void main(String[] args) {
        HttpRequestUtil gethttp=new HttpRequestUtil();
        TopApiConfig topApiConfig=new TopApiConfig();
        try {
            String url=topApiConfig.getHome();
            System.out.println(url);
            Map<String, String> map = new HashMap<String, String>();
            map.put(topApiConfig.getQ(),"习近平");
            map.put(topApiConfig.getApiKey(),"2c2b3417e7584cb2abcf19564789864d");
            map.put(topApiConfig.getCountry(),"cn");
            gethttp.HttpsGetData(url,map);
            gethttp.Do();

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
