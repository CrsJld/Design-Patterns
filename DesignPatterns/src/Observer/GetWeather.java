package Observer;

import java.util.ArrayList;

public class GetWeather implements Subject{

    private ArrayList<Observer> observers;
    private double Deva;
    private double Timisoara;
    private double Sibiu;

    public GetWeather(){

        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver) {

        observers.add(newObserver);

    }


    public void notifyObserver() {

        for(Observer observer : observers){
            observer.update(Deva, Timisoara, Sibiu);
        }
    }

    public void setDeva(double newDeva){

        this.Deva = newDeva;

        notifyObserver();

    }

    public void setTimisoara(double newTimisoara){

        this.Timisoara = newTimisoara;

        notifyObserver();

    }

    public void setSibiu(double newSibiu){

        this.Sibiu= newSibiu;

        notifyObserver();

    }

}