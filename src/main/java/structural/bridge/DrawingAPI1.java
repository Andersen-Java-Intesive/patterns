package structural.bridge;

public class DrawingAPI1 implements DrawingAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.printf("API1: рисуем круг в координатах (%d, %d) с радиусом %d\n", x, y, radius);
    }
}
