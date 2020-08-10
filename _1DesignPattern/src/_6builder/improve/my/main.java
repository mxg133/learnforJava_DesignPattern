package _6builder.improve.my;

/**
 * @author 孟享广
 * @date 2020-08-10 6:29 下午
 * @description
 */
public class main {
    public static void main(String[] args) {
        commonHouse commonHouse = new commonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        House house = houseDirector.constructHouse();
        house.getM_wall();
//        System.out.println(house);
    }
}
