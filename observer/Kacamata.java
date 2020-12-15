 

import java.util.*;

public class Kacamata implements Subject {
    private ArrayList<Observer> observers;
    private float bright;
   

    public Kacamata() {
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(bright);
        }
    }

    public void brightChanged() {
        notifyObservers();
    }

    public void setBright(float bright) {
        this.bright = bright;
        brightChanged();
    }

    public float getbright() {
        return bright;
    }

    

}
