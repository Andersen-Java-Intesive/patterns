package behavioral.state.mystate;

// ConcreteState A
class DraftState implements State {
    @Override
    public void publish(DocumentContext context) {
        System.out.println("Document is now under review.");
        context.setState(new ModerationState());
    }

    @Override
    public void reject(DocumentContext context) {
        System.out.println("Draft document cannot be rejected.");
    }
}
