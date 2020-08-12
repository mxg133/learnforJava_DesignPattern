package _11facade.my;

/**
 * @author 孟享广
 * @date 2020-08-12 10:06 上午
 * @description
 */
public class Screen {
    private static Screen  screen = new Screen();

    public static Screen getScreen() {
        return screen;
    }


    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }


}
