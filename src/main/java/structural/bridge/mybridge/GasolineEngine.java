package structural.bridge.mybridge;

public class GasolineEngine implements Engine {
    @Override
    public void setPower(int power) {
        System.out.println("Gasoline engine power set to " + power + "%.");
    }
}
