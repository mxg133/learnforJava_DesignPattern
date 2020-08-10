package _6builder.improve.my;

/**
 * @author 孟享广
 * @date 2020-08-10 6:11 下午
 * @description
 */
public abstract class  HouseBuilder {
    House house = new House();
    public abstract void buildbasic();
    public abstract  void buildwall();
    public abstract   void buildroofs();

    public House buildhouse(){
        return house;
    }
}
