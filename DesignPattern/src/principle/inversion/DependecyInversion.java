package principle.inversion;

public class DependecyInversion {

	public static void main(String[] args) {
		Person person = new Person();
		person.receive(new Email());
	}

}


class Email {
	public String getInfo() {
		return "�����ʼ���Ϣ: hello,world";
	}
}

//���Person������Ϣ�Ĺ���
//��ʽ1����
//1. �򵥣��Ƚ������뵽
//2. ������ǻ�ȡ�Ķ����� ΢�ţ����ŵȵȣ��������࣬ͬʱPeronsҲҪ������Ӧ�Ľ��շ���
//3. ���˼·������һ������Ľӿ�IReceiver, ��ʾ������, ����Person����ӿ�IReceiver��������
//   ��ΪEmail, WeiXin �ȵ����ڽ��յķ�Χ�����Ǹ���ʵ��IReceiver �ӿھ�ok, �������Ǿͷ���������תԭ��
class Person {
	public void receive(Email email ) {
		System.out.println(email.getInfo());
	}
}
