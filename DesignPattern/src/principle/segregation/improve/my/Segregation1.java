package principle.segregation.improve.my;

/**
 * @author 孟享广
 * @date 2020-08-06 12:41 下午
 * @description
 */
public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());
        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());

    }
}

interface Interface1{
    void operation1();
}
interface Interface23{
    void operation2();
    void operation3();
}
interface Interface45{
    void operation4();
    void operation5();
}

class B implements Interface1, Interface23{

    @Override
    public void operation1() {
        System.out.println("B实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B实现了operation3");
    }
}

class D implements Interface1, Interface45{

    @Override
    public void operation1() {
        System.out.println("D实现了operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D实现了operation5");
    }
}

class A{
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface23 i){
        i.operation2();
    }
    public void depend3(Interface23 i){
        i.operation3();
    }
}

class C{
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(Interface45 i){
        i.operation4();
    }
    public void depend5(Interface45 i){
        i.operation5();
    }
}
