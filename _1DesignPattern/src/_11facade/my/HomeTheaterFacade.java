package _11facade.my;

/**
 * @author 孟享广
 * @date 2020-08-12 10:13 上午
 * @description
 */
public class HomeTheaterFacade {

    private TheaterLight theaterLight;
    private Popmihua popmihua;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DvDplayer dvDplayer;

    public HomeTheaterFacade(){
//        super();
        this.theaterLight = TheaterLight.getInstance();
        this.popmihua = Popmihua.getInstance();
        this.stereo = Stereo.getStereo();
        this.projector = Projector.getProjector();
        this.screen = Screen.getScreen();
        this.dvDplayer = DvDplayer.getInstance();
    }

    public void ready(){
        popmihua.on();
        popmihua.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvDplayer.on();
        theaterLight.dim();
    }

    public void play(){
        dvDplayer.play();

    }

    public void pause(){
        dvDplayer.pause();
    }

    public void end(){
        popmihua.off();
        theaterLight.bright();
        popmihua.off();
        screen.up();
        projector.off();
        stereo.off();
        dvDplayer.off();

    }

}
