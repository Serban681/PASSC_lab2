import java.util.ArrayList;
import java.util.Date;

public class TemperatureSensor implements Subject{
    private ArrayList<Observer> observers;
    private int tempState;
    private int sensorID;
    private String location;
    private String lastTechnicalRevision;
    private float metrologicalPrecision;

    public TemperatureSensor(int initialTemp,
                             int sensorID,
                             String location,
                             String lastTechnicalRevision,
                             float metrologicalPrecision){
        tempState=initialTemp;
        observers=new ArrayList<Observer>();
        this.sensorID = sensorID;
        this.location = location;
        this.lastTechnicalRevision = lastTechnicalRevision;
        this.metrologicalPrecision = metrologicalPrecision;
    }

    public int getTemp(){
        return tempState;
    }

    public TempSubject getTempSubject() {
        return new TempSubject(tempState, sensorID, location, lastTechnicalRevision, metrologicalPrecision);
    }
    public void setTemp(int newTemp){
        tempState=newTemp;
        notifyObservers();
    }

    public void attach(Observer o) {
        observers.add(o);
    }

    public  void detach(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(){
        for (Observer o:observers)
            o.update(this);
    }

}
