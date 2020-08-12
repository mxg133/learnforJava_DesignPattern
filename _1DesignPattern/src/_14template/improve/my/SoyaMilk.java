package _14template.improve.my;

/**
 * @author 孟享广
 * @date 2020-08-12 10:34 下午
 * @description
 */
public abstract class SoyaMilk {
    final void make(){
        select();
        if (customerWant()) {
            addCondiments();
        }
        soak();
        beat();
    }

    void select(){
        System.out.println("第一步选择新鲜黄豆 ");
    }

    abstract void addCondiments();

    void soak(){
        System.out.println("第三步 浸泡3小时");
    }

    void beat(){
        System.out.println("第四步 打碎 豆浆");
    }

    //
    boolean customerWant(){
        return true;
    }
}
