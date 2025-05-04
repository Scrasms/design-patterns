package iterator.kfc;

public class Client {
    public static void main(String[] args) {
        ChickenBox order = new ChickenBox();
        order.addChicken(new Chicken("Wicked wings", 10, 10, false));
        order.addChicken(new Chicken("Hot n Cripsy", 8, 9, true));
        order.addChicken(new Chicken("Original Recipe", 20, 1, false));
        order.addChicken(new Chicken("Popcorn chicken", 5, 10, false));

        Iterator<Chicken> it = order.createIterator();
        while (it.hasNext()) {
            System.out.println(it.getNext().getInfo());
        }

        SidesBox sideOrder = new SidesBox();
        sideOrder.addSide(new Sides("Gravy", 4, 7, true));
        sideOrder.addSide(new Sides("Chips", 5, 10, true));
        sideOrder.addSide(new Sides("Coleslaw", 7, 0, true));
        sideOrder.addSide(new Sides("Slaw", 10, 5, false));
        sideOrder.addSide(new Sides("Potatoes and Gravy", 6, 9, true));
        sideOrder.addSide(new Sides("Watermelon", 1, 10, true));

        Iterator<Sides> si = sideOrder.createIterator();
        while (si.hasNext()) {
            System.out.println(si.getNext().getInfo());
        }
    }
}
