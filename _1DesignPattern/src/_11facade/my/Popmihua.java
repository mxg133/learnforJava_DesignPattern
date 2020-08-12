package _11facade.my;

/**
 * @author 孟享广
 * @date 2020-08-12 10:02 上午
 * @description
 */
public class Popmihua {
    private static Popmihua instance = new Popmihua();

    public static Popmihua getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" 爆米花 开机中······ ");
    }

    public void off() {
        System.out.println(" 爆米花机 关机······· ");
    }

    public void pop() {
        System.out.println(" 爆米花机蹦爆米花中·····  ");
    }
}
