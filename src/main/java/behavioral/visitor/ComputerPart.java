package behavioral.visitor;

interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}