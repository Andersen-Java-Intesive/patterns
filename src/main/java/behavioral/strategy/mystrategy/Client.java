package behavioral.strategy.mystrategy;

public class Client {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        SortContext context = new SortContext();

        // Используем стратегию пузырьковой сортировки
        context.setStrategy(new BubbleSortStrategy());
        context.sortArray(array.clone());

        // Используем стратегию быстрой сортировки
        context.setStrategy(new QuickSortStrategy());
        context.sortArray(array.clone());
    }
}
