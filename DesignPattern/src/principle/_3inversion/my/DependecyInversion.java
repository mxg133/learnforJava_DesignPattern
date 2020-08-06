package principle._3inversion.my;

/**
 * @author 孟享广
 * @date 2020-08-06 2:18 下午
 * @description
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}
 class Email {
    public String getInfo(){
        return "电子邮件信息：hello world";
    }

}
class Person {
    public void receive(Email email){
        System.out.println(email.getInfo());
    }


}