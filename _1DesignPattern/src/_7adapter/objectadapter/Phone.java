package _7adapter.objectadapter;

public class Phone {

	//���
	public void charging(IVoltage5V iVoltage5V) {
		if(iVoltage5V.output5V() == 5) {
			System.out.println("��ѹΪ5V, ���Գ��~~");
		} else if (iVoltage5V.output5V() > 5) {
			System.out.println("��ѹ����5V, ���ܳ��~~");
		}
	}
}
