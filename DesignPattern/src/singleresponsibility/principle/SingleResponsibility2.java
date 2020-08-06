package singleresponsibility.principle;

public class SingleResponsibility2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoadVehicle roadVehicle = new RoadVehicle();
		roadVehicle.run("Ħ�г�");
		roadVehicle.run("����");
		
		AirVehicle airVehicle = new AirVehicle();
		
		airVehicle.run("�ɻ�");
	}

}

//����2�ķ���
//1. ���ص�һְ��ԭ��
//2. �����������ĸĶ��ܴ󣬼�����ֽ⣬ͬʱ�޸Ŀͻ���
//3. �Ľ���ֱ���޸�Vehicle �࣬�Ķ��Ĵ����Ƚ���=>����3

class RoadVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "��·����");
	}
}

class AirVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "�������");
	}
}

class WaterVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "ˮ������");
	}
}