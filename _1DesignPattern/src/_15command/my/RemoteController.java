package _15command.my;

/**
 * @author 孟享广
 * @date 2020-08-13 10:45 上午
 * @description
 */
public class RemoteController {
    Command oncommands[];
    Command offcommands[];

    Command undoCommend;

    public RemoteController() {
        oncommands =new Command[5];
        offcommands =new Command[5];

        for (int i = 0; i < 5; i++) {
            oncommands[i] = new NoCommand();
            offcommands[i] = new NoCommand();
        }
    }

    public void setCommand(int on, Command onCommand, Command offCommand){
        oncommands[on] = onCommand;
        offcommands[on] = offCommand;
    }

    public void onButtonWasPushed(int on){
        oncommands[on].execute();
        undoCommend = oncommands[on];
    }

    public void offButtonWasPushed(int on){
        oncommands[on].undo();
        undoCommend = offcommands[on];
    }

    public void undoCommendPushed(){
        undoCommend.undo();
    }
}