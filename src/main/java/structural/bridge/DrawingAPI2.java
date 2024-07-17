package structural.bridge;

public class DrawingAPI2 implements DrawingAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.printf("API2: рисуем круг в координатах (%d, %d) с радиусом %d\n", x, y, radius);
    }
}