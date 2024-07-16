package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class ClientClass {
    public static void main(String[] args) {
        Circle circle = new Circle();
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(new LegacyRectangleAdapter(legacyRectangle));
        shapes.forEach(Shape::draw);
    }
}
