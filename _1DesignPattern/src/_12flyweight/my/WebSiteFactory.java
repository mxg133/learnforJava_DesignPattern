package _12flyweight.my;

import java.util.HashMap;

/**
 * @author 孟享广
 * @date 2020-08-12 11:31 上午
 * @description
 */
public class WebSiteFactory {

    private HashMap<String, ConWebSite> pool = new HashMap<>();

    public WebSite getWebsiteCategory(String type){
        if (!pool.containsKey(type)){
            pool.put(type, new ConWebSite(type));
        }
        return (WebSite)pool.get(type);
    }

    public int getCount(){
        return pool.size();
    }


}
