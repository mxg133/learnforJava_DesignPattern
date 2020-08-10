package _6builder.improve.my;

/**
 * @author 孟享广
 * @date 2020-08-10 6:20 下午
 * @description
 */
public class HighBuilding extends HouseBuilder{

    @Override
    public void buildbasic() {
        System.out.println("高楼--打地基");
    }

    @Override
    public void buildwall() {
        System.out.println("高楼--砌墙");

    }

    @Override
    public void buildroofs() {
        System.out.println("高楼-- 屋顶");

    }
}
