package _7adapter.classadapter.my;

/**
 * @author 孟享广
 * @date 2020-08-11 9:20 上午
 * @description
 */
public class Adapter extends V220v implements  V5v{


    @Override
    public int output5V() {
        int srcv = output220V();

        int dest = srcv/44;

        return dest;

    }
}
