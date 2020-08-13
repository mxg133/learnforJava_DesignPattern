package _16visitor.my;

/**
 * @author 孟享广
 * @date 2020-08-13 2:52 下午
 * @description
 */
public class main {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        Man man = new Man();
        Woman woman = new Woman();
        objectStructure.attach(man);
        objectStructure.attach(woman);

        Success success = new Success();
        objectStructure.display(success);


    }
}
