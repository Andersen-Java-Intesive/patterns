package creational.prototype.myprototype;

public class Client {
    public static void main(String[] args) {
        // Создаем объекты-прототипы
        Circle originalCircle = new Circle(5);
        Square originalSquare = new Square(4);

        // Клонируем объекты
        Circle clonedCircle = (Circle) originalCircle.clone();
        Square clonedSquare = (Square) originalSquare.clone();

        // Используем клонированные объекты
        System.out.println("Original Objects:");
        originalCircle.draw();
        originalSquare.draw();

        System.out.println("\nCloned Objects:");
        clonedCircle.draw();
        clonedSquare.draw();
    }
}
