package _1principle._3inversion.improve.my;

/**
 * @author 孟享广
 * @date 2020-08-06 2:35 下午
 * @description
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());

        person.receive(new weeiin());
    }
}
interface IReceiver{
    public String getInfo();
}

class Email implements IReceiver{
    @Override
    public String getInfo(){
        return "电子邮件信息：hello world";
    }

}
class weeiin implements IReceiver{

    @Override
    public String getInfo() {
            return "weeiixxin邮件信息：hello world";
    }
}
class Person {
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }


}


