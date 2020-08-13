package _15command;

public class LightOnCommand implements Command {

	//�ۺ�LightReceiver
	
	LightReceiver light;
	
	//������
	public LightOnCommand(LightReceiver light) {
		super();
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		//���ý����ߵķ���
		light.on();
	}

	

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		//���ý����ߵķ���
		light.off();
	}

}
