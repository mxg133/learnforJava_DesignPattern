package _15command;

public class LightOffCommand implements Command {

	// �ۺ�LightReceiver

	LightReceiver light;

	// ������
	public LightOffCommand(LightReceiver light) {
			super();
			this.light = light;
		}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		// ���ý����ߵķ���
		light.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		// ���ý����ߵķ���
		light.on();
	}
}
