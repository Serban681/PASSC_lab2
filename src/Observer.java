public abstract class Observer {
    protected int displayId = 0;

    public Observer(int displayId) {
        this.displayId = displayId;
    }
    abstract void update(Subject subject);
}
