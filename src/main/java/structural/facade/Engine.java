package structural.facade;

class Engine {
    private int percentPower;

    public void setPercentPower(int percentPower) {
        this.percentPower = percentPower;
        System.out.println("Engine now at " + percentPower + "% power");
    }

    public Engine() {
        this.percentPower = 0;
    }
}