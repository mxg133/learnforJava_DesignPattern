package _11facade.my;

/**
 * @author 孟享广
 * @date 2020-08-12 10:04 上午
 * @description
 */
public class Projector {
    private static Projector projector = new Projector();

    public static Projector getProjector() {
        return projector;
    }


    public void on() {
        System.out.println(" 投影仪 on ");
    }

    public void off() {
        System.out.println(" 投影仪 ff ");
    }

    public void focus() {
        System.out.println(" 投影仪 is Projector  ");
    }
}
