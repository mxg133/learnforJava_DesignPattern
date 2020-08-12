package _13proxy.cglib.my;

import _13proxy.cglib.ProxyFactory;

/**
 * @author 孟享广
 * @date 2020-08-12 5:11 下午
 * @description
 */
public class main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Teacher proxyFactory = (Teacher)new ProxyFactory(teacher).getProxyInstance();

        teacher.teach();
    }
}
