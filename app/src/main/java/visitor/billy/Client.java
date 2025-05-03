package visitor.billy;

// Client that will interact with the pattern
public class Client {
    public static void main(String[] args) {
        IntArray array = new IntArray();
        IntLinkedList list = new IntLinkedList();
        IntMap map = new IntMap();
        for (int i = 0; i < 10; i++) {
            array.add(i);
            list.add(i);
            map.put(i, i);
        }

        // Visit array
        array.accept(new DataPrintVisitor());
        DataSumVisitor visitor1 = new DataSumVisitor();
        array.accept(visitor1);
        System.out.println(visitor1.getSum());

        // Visit list
        list.accept(new DataPrintVisitor());
        DataSumVisitor visitor2 = new DataSumVisitor();
        list.accept(visitor2);
        System.out.println(visitor2.getSum());

        // Visit map
        map.accept(new DataPrintVisitor());
        DataSumVisitor visitor3 = new DataSumVisitor();
        map.accept(visitor3);
        System.out.println(visitor3.getSum());
    }
}
