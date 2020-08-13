package _16visitor.my;

/**
 * @author 孟享广
 * @date 2020-08-13 2:26 下午
 * @description
 */
public class Man extends Person {

    @Override
    public void accpect(Action action) {
        action.getManResult(this);
    }
}
