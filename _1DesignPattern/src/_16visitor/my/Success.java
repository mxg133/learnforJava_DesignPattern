package _16visitor.my;

/**
 * @author 孟享广
 * @date 2020-08-13 2:27 下午
 * @description
 */
public class Success extends Action{

    @Override
    public void getManResult(Man man) {
        System.out.println("  男的给的评价是 很成功！  ");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("  女人给的评价是 很成功！  ");
    }
}
