package composite;

public class AddNode implements CalculatorNode {
    private CalculatorNode left;
    private CalculatorNode right;

    public AddNode(CalculatorNode left, CalculatorNode right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }

    @Override
    public String print() {
        return left.print() + " + " + right.print();
    }
}
