package _13proxy.staticproxy.my;

/**
 * @author 孟享广
 * @date 2020-08-12 1:30 下午
 * @description
 */
public class teacher implements iTeacher {
    @Override
    public void teach() {
        System.out.println("真的老是在上课");
    }
}
