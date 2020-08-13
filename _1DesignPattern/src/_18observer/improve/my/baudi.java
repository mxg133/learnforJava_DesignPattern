package _18observer.improve.my;

/**
 * @author 孟享广
 * @date 2020-08-13 9:52 下午
 * @description
 */
public class baudi implements Observer {
    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    // 更新 天气情况，是由 WeatherData 来调用，我使用推送模式
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    // 显示
    public void display() {
        System.out.println("**www.baidu.come: " + temperature + "***");
        System.out.println("**www.baidu.com" + pressure + "***");
        System.out.println("**www.baidu.com" + humidity + "***");
    }
}
