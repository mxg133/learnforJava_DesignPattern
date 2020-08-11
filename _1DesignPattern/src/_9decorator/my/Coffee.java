package _9decorator.my;

/**
 * @author 孟享广
 * @date 2020-08-11 3:51 下午
 * @description
 */
public  class Coffee extends Drink{


    @Override
    public float cost() {
        return super.getPrice();
    }
}
