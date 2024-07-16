package behavioral.visitor;

public class ClientClass {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();

        ComputerPartVisitor displayVisitor = new ComputerPartDisplayVisitor();
        ComputerPartVisitor repairVisitor = new ComputerPartRepairVisitor();

        System.out.println("Display Visitor:");
        computer.accept(displayVisitor);

        System.out.println("\nRepair Visitor:");
        computer.accept(repairVisitor);
    }
}
