package structural.bridge.mybridge;

class BasicControl extends Control {
    public BasicControl(Engine engine) {
        super(engine);
    }

    @Override
    public void controlPower(int power) {
        System.out.println("Basic control setting power.");
        engine.setPower(power);
    }
}

