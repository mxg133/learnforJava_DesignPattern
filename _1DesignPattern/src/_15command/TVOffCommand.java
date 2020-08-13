package _15command;

public class TVOffCommand implements Command {

	// �ۺ�TVReceiver

	TVReceiver tv;

	// ������
	public TVOffCommand(TVReceiver tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		// ���ý����ߵķ���
		tv.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		// ���ý����ߵķ���
		tv.on();
	}
}
