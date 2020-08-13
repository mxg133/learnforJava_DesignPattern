package _15command.my;

/**
 * @author 孟享广
 * @date 2020-08-13 10:29 上午
 * @description
 */
public class LightOnCommend implements  Command {


    LightReceiver lightReceiver;

    public LightOnCommend(LightReceiver lightReceiver) {
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
