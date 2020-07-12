package Observer;



public class WeatherObserver implements Observer {

    private double Deva;
    private double Timisoara;
    private double Sibiu;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject GetWeather;

    public WeatherObserver(Subject GetWeather){

        this.GetWeather = GetWeather;

        this.observerID = ++observerIDTracker;

        System.out.println("New Observer " + this.observerID);

        GetWeather.register(this);

    }

    public void update(double Deva, double Timisoara, double Sibiu) {

        this.Deva = Deva;
        this.Timisoara = Timisoara;
        this.Sibiu = Sibiu;

        printWeather();

    }

    public void printWeather(){

        System.out.println(observerID + "\nWeather in Deva: " + Deva + " Celsius" + "\nWeather in Timisoara: " +
                Timisoara + " Celsius"+ "\nTWeather in Sibiu: " + Sibiu + " Celsius" +"\n");

    }

}