public class NumericDisplay implements Observer{

    private int value;

    public NumericDisplay(){
    }

    public void update(Subject subject) {
        this.value=subject.getTempSubject().tempState;
        display();
    }

    public void display(){
        System.out.println("Current value = "+value);
    }
}
