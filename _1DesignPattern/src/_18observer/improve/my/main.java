package _18observer.improve.my;

/**
 * @author 孟享广
 * @date 2020-08-13 9:49 下午
 * @description
 */
public class main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions();
        baudi baudi = new baudi();

        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baudi);

        System.out.println();
        weatherData.setData(10f,100f,30f);
        System.out.println();

        weatherData.removerObserver(currentConditions);

        weatherData.setData(10f,100f,30f);





    }
}
