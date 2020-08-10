package _5prototype_DeepCopy._1improve.my;

/**
 * @author 孟享广
 * @date 2020-08-10 2:23 下午
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tto", 12, "绿色");
        sheep.friend = new Sheep("jack", 2, "黑色");
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3= (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();
        System.out.println(sheep2 + "" + sheep2.friend.hashCode());
    }
}
