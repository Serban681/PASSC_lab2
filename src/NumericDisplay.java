public class NumericDisplay extends Observer{

    private int value;

    public NumericDisplay(int displayId) {
        super(displayId);
    }

    public void update(Subject subject) {
        this.value=subject.getTempSubject().tempState;
        display();
    }

    public void display(){
        System.out.println("Current value = "+value);
    }
}
