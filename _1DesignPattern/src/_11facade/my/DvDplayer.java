package _11facade.my;

/**
 * @author 孟享广
 * @date 2020-08-12 9:58 上午
 * @description
 */
public class DvDplayer {
    private static DvDplayer instance = new DvDplayer();

//    private DvDplayer() {
//    }

    public static DvDplayer getInstance() {
        return instance;
    }

    public void on(){
        System.out.println(" dvd 开始运行（开机中）``````  ");
    }

    public void off(){
        System.out.println(" dvd 结束运行``````  ");
    }

    public void play(){
        System.out.println(" dvd 正在播放``````  ");
    }

    public void pause(){
        System.out.println(" dvd 暂停中``````  ");
    }
}
