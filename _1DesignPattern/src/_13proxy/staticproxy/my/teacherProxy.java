package _13proxy.staticproxy.my;

/**
 * @author 孟享广
 * @date 2020-08-12 1:31 下午
 * @description
 */
public class teacherProxy implements iTeacher {
    private iTeacher target;

    public teacherProxy(iTeacher target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("  假的老师  ");
        System.out.println();
        target.teach();
    }
}
