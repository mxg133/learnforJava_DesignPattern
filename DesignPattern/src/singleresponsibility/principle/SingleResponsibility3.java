package singleresponsibility.principle;

public class SingleResponsibility3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle2 vehicle2  = new Vehicle2();
		vehicle2.run("����");
		vehicle2.runWater("�ִ�");
		vehicle2.runAir("�ɻ�");
	}

}


//��ʽ3�ķ���
//1. �����޸ķ���û�ж�ԭ������������޸ģ�ֻ�����ӷ���
//2. ������Ȼû������������������ص�һְ��ԭ�򣬵����ڷ��������ϣ���Ȼ�����ص�һְ��
class Vehicle2 {
	public void run(String vehicle) {
		//����
		
		System.out.println(vehicle + " �ڹ�·������....");
		
	}
	
	public void runAir(String vehicle) {
		System.out.println(vehicle + " �����������....");
	}
	
	public void runWater(String vehicle) {
		System.out.println(vehicle + " ��ˮ����....");
	}
	
	//����2.
	//..
	//..
	
	//...
}
