package structural.facade;

public class MachineTelegraph {
    private Engine engine;
    private Transmission transmission;

    public MachineTelegraph(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    public void fullSpeedAhead() {
        engine.setPercentPower(100);
        transmission.ahead();
    }

    public void stopEngine() {
        engine.setPercentPower(0);
    }

    public void asternSlow() {
        engine.setPercentPower(20);
        transmission.astern();
    }
}
