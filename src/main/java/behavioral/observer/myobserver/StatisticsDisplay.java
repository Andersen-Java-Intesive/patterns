package behavioral.observer.myobserver;

// ConcreteObserver2
class StatisticsDisplay implements Observer {
    private double temperature;

    @Override
    public void update(double temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Statistics: Average temperature: " + temperature + "°C");
    }
}
