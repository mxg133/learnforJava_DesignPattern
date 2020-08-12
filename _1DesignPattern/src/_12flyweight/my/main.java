package _12flyweight.my;

import java.time.temporal.WeekFields;

/**
 * @author 孟享广
 * @date 2020-08-12 11:40 上午
 * @description
 */
public class main {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        User tom = new User("tom");
        User jack = new User("jack");
        User jack1 = new User("jack1");
        User jack11 = new User("jack11");

        WebSite webSite1 = webSiteFactory.getWebsiteCategory("新闻");

        webSite1.use(tom);

        WebSite webSite2 = webSiteFactory.getWebsiteCategory("博客");
        webSite2.use(jack);

        WebSite webSite3 = webSiteFactory.getWebsiteCategory("博客");
        webSite3.use(jack1);

        WebSite webSite4 = webSiteFactory.getWebsiteCategory("博客");
        webSite4.use(jack11);
        System.out.println(  webSiteFactory.getCount());

    }
}
