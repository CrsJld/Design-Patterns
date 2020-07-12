package Observer;

public class Main{
public static void main(String[]args){

    GetWeather GetWeather= new GetWeather();
    WeatherObserver Observer1 = new WeatherObserver(GetWeather);

    GetWeather.setDeva(200);
    GetWeather.setTimisoara(1100);
    GetWeather.setSibiu(250.50);

    WeatherObserver Observer2 = new WeatherObserver(GetWeather);

    GetWeather.setDeva(200);
    GetWeather.setTimisoara(1100);
    GetWeather.setSibiu(250.50);


}

}