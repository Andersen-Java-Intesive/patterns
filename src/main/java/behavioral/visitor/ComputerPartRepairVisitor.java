package behavioral.visitor;

class ComputerPartRepairVisitor implements ComputerPartVisitor {
    public void visit(Keyboard keyboard) {
        System.out.println("Repairing Keyboard.");
    }

    public void visit(Monitor monitor) {
        System.out.println("Repairing Monitor.");
    }

    public void visit(Mouse mouse) {
        System.out.println("Repairing Mouse.");
    }

    public void visit(Computer computer) {
        System.out.println("Repairing Computer.");
    }
}
