package _7adapter.objectadapter;

//��������
public class VoltageAdapter  implements IVoltage5V {

	private Voltage220V voltage220V; // ������ϵ-�ۺ�
	
	
	//ͨ��������������һ�� Voltage220V ʵ��
	public VoltageAdapter(Voltage220V voltage220v) {
		
		this.voltage220V = voltage220v;
	}



	@Override
	public int output5V() {
		
		int dst = 0;
		if(null != voltage220V) {
			int src = voltage220V.output220V();//��ȡ220V ��ѹ
			System.out.println("ʹ�ö�������������������~~");
			dst = src / 44;
			System.out.println("������ɣ�����ĵ�ѹΪ=" + dst);
		}
		
		return dst;
		
	}

}
