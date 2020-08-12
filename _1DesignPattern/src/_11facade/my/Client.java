package _11facade.my;

/**
 * @author 孟享广
 * @date 2020-08-12 10:12 上午
 * @description
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade h = new HomeTheaterFacade();
        h.ready();

        h.play();

        h.pause();

        h.end();
    }
}
