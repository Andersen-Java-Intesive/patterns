package behavioral.state.mystate;

// ConcreteState C
class PublishedState implements State {
    @Override
    public void publish(DocumentContext context) {
        System.out.println("Document is already published.");
    }

    @Override
    public void reject(DocumentContext context) {
        System.out.println("Published document cannot be rejected.");
    }
}
