package _7adapter.classadapter.my;

/**
 * @author 孟享广
 * @date 2020-08-11 9:23 上午
 * @description
 */
public class iPhone {
    public void charing( V5v v5v){
        if (v5v.output5V() == 5 ){
            System.out.println("电压5！充电");

        }else {
            System.out.println("失败");

        }
    }
}
