package _6builder.improve.my;

/**
 * @author 孟享广
 * @date 2020-08-10 6:21 下午
 * @description
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //
    public  House constructHouse(){
        houseBuilder.buildbasic();
        houseBuilder.buildwall();
        houseBuilder.buildroofs();
        return houseBuilder.buildhouse();
    }
}
