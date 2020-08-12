package _13proxy.staticproxy.my;

/**
 * @author 孟享广
 * @date 2020-08-12 1:35 下午
 * @description
 */
public class main {
    public static void main(String[] args) {
        teacherProxy proxy = new teacherProxy(new teacher());

        proxy.teach();
    }
}
