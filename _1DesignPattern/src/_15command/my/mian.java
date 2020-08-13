package _15command.my;

/**
 * @author 孟享广
 * @date 2020-08-13 11:15 上午
 * @description
 */
public class mian {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();

        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommend lightOnCommend = new LightOnCommend(lightReceiver);
        LightOffCommend lightOffCommend = new LightOffCommend(lightReceiver);

        remoteController.setCommand(0, lightOnCommend, lightOffCommend);

        remoteController.onButtonWasPushed(0);

        remoteController.undoCommendPushed();

        remoteController.offButtonWasPushed(0);

        remoteController.undoCommendPushed();

    }
}
