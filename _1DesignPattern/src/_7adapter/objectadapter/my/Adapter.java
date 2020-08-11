package _7adapter.objectadapter.my;

import javax.print.attribute.standard.NumberOfInterveningJobs;

/**
 * @author 孟享广
 * @date 2020-08-11 9:20 上午
 * @description
 */
public class Adapter  implements V5v {
    private V220v v220v;

    public Adapter(V220v v220v) {
        this.v220v = v220v;
    }

    @Override
    public int output5V() {

        int dest = 0;
        if (v220v != null){
            int src = v220v.output220V();
            System.out.println("转化！");
            dest = src/44;
        }

            return dest;
    }
}
