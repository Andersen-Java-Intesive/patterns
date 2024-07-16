package structural.facade;

public class ClientClass {
    public static void main(String[] args) {
        MachineTelegraph machineTelegraph = new MachineTelegraph(new Engine(), new Transmission());
        machineTelegraph.fullSpeedAhead();
        machineTelegraph.asternSlow();
        machineTelegraph.stopEngine();
    }
}
