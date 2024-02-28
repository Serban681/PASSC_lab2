import java.util.ArrayList;
import java.util.List;

public class AverageDisplay implements Observer {
    private List<Float> values = new ArrayList<Float>();

    public void update(Subject subject) {
        this.values.add((float)subject.getTempSubject().tempState);
        display();
    }

    public void display(){
        int sum = 0;
        for (float value : values) {
            sum += value;
        }
        System.out.println("Average value = "+((float)sum/values.size()));
    }
}
