package _3singleton.type3.my;

/**
 * @author 孟享广
 * @date 2020-08-08 10:56 上午
 * @description
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        singleton instance = singleton.getInstance();

    }
}

class singleton{
    private static singleton instance;

    private singleton() {
    }

    public static singleton getInstance(){
        if (instance == null){
            instance = new singleton();
        }
        return instance;
    }


}