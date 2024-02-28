public class TextDisplay implements Observer {
    private int value;

    public TextDisplay(){
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
