package structural.bridge.mybridge;

abstract class Control {
    protected Engine engine;

    protected Control(Engine engine) {
        this.engine = engine;
    }

    public abstract void controlPower(int power);
}
