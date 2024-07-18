package structural.bridge.mybridge;

class AdvancedControl extends Control {
    public AdvancedControl(Engine engine) {
        super(engine);
    }

    @Override
    public void controlPower(int power) {
        System.out.println("Advanced control setting power with extra steps.");
        // Дополнительные операции
        engine.setPower(power);
    }
}
