package behavioral.state.mystate;

// State
interface State {
    void publish(DocumentContext context);
    void reject(DocumentContext context);
}

