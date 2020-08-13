package _16visitor.my;

/**
 * @author 孟享广
 * @date 2020-08-13 2:30 下午
 * @description
 */
public class Fail extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println(" 男生给的是 失败  ");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(" 女人给的是 失败  ");
    }
}
