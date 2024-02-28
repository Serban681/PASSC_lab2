import java.util.ArrayList;
import java.util.Scanner;

public class InteractiveMenu {
    private ArrayList<TemperatureSensor> temperatureSensors = new ArrayList<TemperatureSensor>();
    private ArrayList<Observer> displays = new ArrayList<Observer>();

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create a new temperature sensor");
            System.out.println("2. Create a new display");
            System.out.println("3. Attach an existing display to one of the existing temperature sensors");
            System.out.println("4. Detach a display from a sensor");
            System.out.println("5. Set a new temperature value to one of the sensors");
            System.out.println("6. Exit");

            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Enter the initial temperature value");
                    int initialTemp = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the location");
                    String location = scanner.nextLine();
                    System.out.println("Enter the last technical revision");
                    String lastTechnicalRevision = scanner.nextLine();
                    System.out.println("Enter the metrological precision");
                    float metrologicalPrecision = Float.parseFloat(scanner.nextLine());
                    createTemperatureSensor(new TempSubject(initialTemp, location, lastTechnicalRevision, metrologicalPrecision));
                    break;
                case 2:
                    System.out.println("Enter the display type (text, numeric or average)");
                    String displayType = scanner.nextLine();
                    createDisplay(DisplayType.valueOf(displayType.toUpperCase()));
                    break;
                case 3:
                    System.out.println("Enter the sensor ID");
                    int sensorId = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the display ID");
                    int displayId = Integer.parseInt(scanner.nextLine());
                    attachDisplayToSensor(sensorId, displayId);
                    break;
                case 4:
                    System.out.println("Enter the sensor ID");
                    sensorId = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the display ID");
                    displayId = Integer.parseInt(scanner.nextLine());
                    detachDisplayFromSensor(sensorId, displayId);
                    break;
                case 5:
                    System.out.println("Enter the sensor ID");
                    sensorId = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the new temperature value");
                    int newTemp = Integer.parseInt(scanner.nextLine());
                    setTemperature(sensorId, newTemp);
                    break;
                case 6:
                    return;
            }
        }
    }

    public void createTemperatureSensor(TempSubject data) {
        temperatureSensors.add(new TemperatureSensor(data.tempState, temperatureSensors.size(), data.location, data.lastTechnicalRevision, data.metrologicalPrecision));
    }

    public void createDisplay(DisplayType displayType) {
        switch (displayType) {
            case AVERAGE:
                displays.add(new AverageDisplay(displays.size()));
                break;
            case NUMERIC:
                displays.add(new NumericDisplay(displays.size()));
                break;
            case TEXT:
                displays.add(new TextDisplay(displays.size()));
                break;
            default:
                break;
        }
    }

    public void attachDisplayToSensor(int sensorId, int displayId) {
        temperatureSensors.get(sensorId).attach(displays.get(displayId));
    }

    public void detachDisplayFromSensor(int sensorId, int displayId) {
        temperatureSensors.get(sensorId).detach(displays.get(displayId));
    }

    public void setTemperature(int sensorId, int newTemp) {
        temperatureSensors.get(sensorId).setTemp(newTemp);
    }
}
