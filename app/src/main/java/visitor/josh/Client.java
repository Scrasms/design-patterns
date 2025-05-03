package visitor.josh;


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

        array.accept(new PrintVisitor());
        list.accept(new PrintVisitor());
        map.accept(new PrintVisitor());
    }
}
