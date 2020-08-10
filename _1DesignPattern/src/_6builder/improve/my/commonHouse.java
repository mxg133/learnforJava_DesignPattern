package _6builder.improve.my;

/**
 * @author 孟享广
 * @date 2020-08-10 6:18 下午
 * @description
 */
public class commonHouse extends HouseBuilder {

    @Override
    public void buildbasic() {
        System.out.println("comm打地基");
    }

    @Override
    public void buildwall() {
        System.out.println("comm --砌墙");
    }

    @Override
    public void buildroofs() {
        System.out.println("comm--屋顶");
    }
}
