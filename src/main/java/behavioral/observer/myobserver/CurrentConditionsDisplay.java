package behavioral.observer.myobserver;

class CurrentConditionsDisplay implements Observer {
    private double temperature;

    @Override
    public void update(double temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "°C");
    }
}
