package structural.bridge.mybridge;

public class Client {
    public static void main(String[] args) {
        Engine electricEngine = new ElectricEngine();
        Engine gasolineEngine = new GasolineEngine();

        Control basicControlWithElectric = new BasicControl(electricEngine);
        Control advancedControlWithGasoline = new AdvancedControl(gasolineEngine);

        basicControlWithElectric.controlPower(50);
        advancedControlWithGasoline.controlPower(75);
    }
}
