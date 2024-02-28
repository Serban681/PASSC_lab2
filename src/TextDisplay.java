public class TextDisplay extends Observer {
    private int value;

    public TextDisplay(int displayId) {
        super(displayId);
    }

    public void update(Subject subject) {
        this.value=subject.getTempSubject().tempState;
        display();
    }

    public void display(){
        if(this.value >= 20)
            System.out.println("warm");
        else
            System.out.println("cold");
    }
}
