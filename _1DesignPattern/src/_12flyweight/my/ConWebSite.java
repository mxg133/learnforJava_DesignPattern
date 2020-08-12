package _12flyweight.my;

/**
 * @author 孟享广
 * @date 2020-08-12 11:29 上午
 * @description
 */
public class ConWebSite extends WebSite {


    private String type = "";

    public ConWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("ConWeb 形式" + type +"使用者："+ user.getName());
    }

}
