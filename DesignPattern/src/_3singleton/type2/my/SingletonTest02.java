package _3singleton.type2.my;

/**
 * @author 孟享广
 * @date 2020-08-08 10:49 上午
 * @description
 */
public class SingletonTest02 {

}
class singleton{
    private singleton() {
    }

    private static singleton instance;

    static {
        instance = new singleton();
    }

    public static singleton getInstance(){
        return instance;
    }
}