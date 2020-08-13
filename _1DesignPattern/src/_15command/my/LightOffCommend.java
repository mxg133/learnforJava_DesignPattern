package _15command.my;

/**
 * @author 孟享广
 * @date 2020-08-13 10:40 上午
 * @description
 */
public class LightOffCommend implements Command {
    LightReceiver lightReceiver;

    public LightOffCommend(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
