package _15command.my;

/**
 * @author 孟享广
 * @date 2020-08-13 11:24 上午
 * @description
 */
public class TVOnCommend implements Command{
    LightReceiver lightReceiver;

    public TVOnCommend(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
