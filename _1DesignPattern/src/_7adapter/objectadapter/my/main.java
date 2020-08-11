package _7adapter.objectadapter.my;

/**
 * @author 孟享广
 * @date 2020-08-11 9:27 上午
 * @description
 */
public class main {
    public static void main(String[] args) {
        System.out.println("-------");
        iPhone iPhone = new iPhone();
        iPhone.charing(new Adapter(new V220v()));
    }
}
