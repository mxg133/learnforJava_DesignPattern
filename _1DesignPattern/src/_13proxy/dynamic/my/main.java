package _13proxy.dynamic.my;

/**
 * @author 孟享广
 * @date 2020-08-12 3:39 下午
 * @description
 */
public class main {
    public static void main(String[] args) {

        iTeacher teacher = new Teacher();
        iTeacher proxyInstance = (iTeacher)new ProxyFactory(teacher).getproxyInstance();

        System.out.println(proxyInstance.getClass());

        proxyInstance.teach();
    }
}
