package behavioral.state.mystate;

public class Client {
    public static void main(String[] args) {
        DocumentContext document = new DocumentContext();

        System.out.println("Current state: DraftState");
        document.publish();  // Переход в состояние ModerationState

        System.out.println("\nCurrent state: ModerationState");
        document.publish();  // Переход в состояние PublishedState

        System.out.println("\nCurrent state: PublishedState");
        document.reject();  // Опубликованный документ не может быть отклонен
    }
}
