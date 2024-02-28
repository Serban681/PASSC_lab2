import java.util.ArrayList;

public class InteractiveMenu {
    private ArrayList<TemperatureSensor> temperatureSensors = new ArrayList<TemperatureSensor>();
    private ArrayList<Observer> displays = new ArrayList<Observer>();

    public void addTemperatureSensor(TemperatureSensor sensor) {
        temperatureSensors.add(sensor);
    }

    public void addDisplay(Observer display) {
        displays.add(display);
    }


}
