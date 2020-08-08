package _3singleton.my;

/**
 * @author 孟享广
 * @date 2020-08-08 9:53 上午
 * @description
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        _3singleton.type2.my.singleton instance = _3singleton.type2.my.singleton.getInstance();
        _3singleton.type2.my.singleton singleton2 = _3singleton.type2.my.singleton.getInstance();
        System.out.println(instance.equals(singleton2));

    }
}

class singleton{
    private singleton() {
    }
    private final static _3singleton.type2.my.singleton instance = new _3singleton.type2.my.singleton();

    public static _3singleton.type2.my.singleton getInstance(){
        return instance;
    }
}
