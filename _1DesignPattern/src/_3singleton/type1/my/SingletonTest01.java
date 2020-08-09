package _3singleton.type1.my;

/**
 * @author 孟享广
 * @date 2020-08-08 9:53 上午
 * @description
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        singleton instance = singleton.getInstance();
        singleton singleton2 = singleton.getInstance();
        System.out.println(instance.equals(singleton2));

    }
}

class singleton{
    private singleton() {
    }
    private final static singleton instance = new singleton();

    public static singleton getInstance(){
        return instance;
    }
}
