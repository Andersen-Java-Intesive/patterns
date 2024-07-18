package behavioral.interpreter.myinterpreter;

public class Client {

    public static void main(String[] args) {
        // Пример выражения: (3 + 5) - 2
        Expression number1 = new NumberExpression(3);
        Expression number2 = new NumberExpression(5);
        Expression number3 = new NumberExpression(2);

        // Создаем выражение для сложения 3 и 5
        Expression addExpression = new AddExpression(number1, number2);

        // Создаем выражение для вычитания результата сложения и 2
        Expression subtractExpression = new SubtractExpression(addExpression, number3);

        // Интерпретируем итоговое выражение
        int result = subtractExpression.interpret();

        System.out.println("(3 + 5) - 2 = " + result);
    }
}

