package _11facade.my;

/**
 * @author 孟享广
 * @date 2020-08-12 10:08 上午
 * @description
 */
public class Stereo {

    private static Stereo stereo = new Stereo();

    public static Stereo getStereo() {
        return stereo;
    }

    public void on() {
        System.out.println(" Stereo on ");
    }

    public void off() {
        System.out.println(" Screen off ");
    }

    public void up() {
        System.out.println(" Screen up.. ");
    }
}
