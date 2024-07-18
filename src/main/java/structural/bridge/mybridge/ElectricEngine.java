package structural.bridge.mybridge;

public class ElectricEngine implements Engine {
    @Override
    public void setPower(int power) {
        System.out.println("Electric engine power set to " + power + "%.");
    }
}
