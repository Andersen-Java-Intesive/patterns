package behavioral.state.states;

import behavioral.state.TrafficLight;

public interface TrafficLightState {

    void handle(TrafficLight trafficLight);

    default void waitTime(int milliseconds) {
        System.out.println("Waiting for " + milliseconds + " milliseconds");
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
