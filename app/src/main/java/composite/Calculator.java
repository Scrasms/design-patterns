package composite;

// Client class that operates on Composite nodes
public class Calculator {
//            +
//           / \
//          3   -
//             / \
//            5   4
    public static void main(String[] args) {
        CalculatorNode three = new ValueNode(3);
        CalculatorNode four = new ValueNode(4);
        CalculatorNode five = new ValueNode(5);

        CalculatorNode bot = new SubtractNode(five, four);
        CalculatorNode head = new AddNode(three, bot);

        System.out.println(head.print() + " = " + head.evaluate());
    }
}
