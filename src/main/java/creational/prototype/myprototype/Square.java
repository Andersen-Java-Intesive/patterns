package creational.prototype.myprototype;

// ConcretePrototype2
class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square with side: " + side);
    }
}
