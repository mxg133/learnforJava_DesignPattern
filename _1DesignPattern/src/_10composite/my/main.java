package _10composite.my;

/**
 * @author 孟享广
 * @date 2020-08-11 10:27 下午
 * @description
 */
public class main {
    public static void main(String[] args) {
        OrganizationComponent unicersity = new Unicersity("野鸡大学", "是一个好大学");

        OrganizationComponent collage1 = new Collage("野鸡学院1", "好的学院1");
        OrganizationComponent collage2 = new Collage("野鸡学院2", "好的学院2");

        OrganizationComponent department1 = new Department("野鸡专业1", "好的专业1");
        OrganizationComponent department2 = new Department("野鸡专业2", "好的专业2");
        OrganizationComponent department3 = new Department("野鸡专业3", "好的专业3");

        collage1.add(department1);
        collage1.add(department2);
        collage1.add(department3);

        OrganizationComponent department4 = new Department("野鸡专业4", "好的专业4");
        collage2.add(department4);

    }
}
