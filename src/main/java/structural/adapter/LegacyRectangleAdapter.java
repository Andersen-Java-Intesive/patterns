package structural.adapter;

public class LegacyRectangleAdapter implements Shape{
    LegacyRectangle legacyRectangle;

    public LegacyRectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public void draw() {
        legacyRectangle.display();
    }
}
