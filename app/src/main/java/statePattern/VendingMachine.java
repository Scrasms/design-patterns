package statePattern;

public class VendingMachine {
    private SuperState state;
    private int stock;
    private boolean workingCard;

    public VendingMachine(boolean card) {
        state = new ItemSelectedState(this);
        stock = 5;
        workingCard = card;
    }

    public int getStock() {
        return stock;
    }

    public void sellStock() {
        stock--;
    }

    public boolean getCard() {
        return workingCard;
    }

    public void setState(SuperState newState) {
        state = newState;
    }

    public void restock() {

    }

    public void swipeCard() {
        System.out.println(state.swipeCard());
    }

    public void selectItem() {
        System.out.println(state.selectItem());
    }

    public void cancel() {
        System.out.println(state.cancel());
    }

    public void dispense() {
        System.out.println(state.dispense());
    }

    public static void main(String[] args) {
        VendingMachine first = new VendingMachine(true);
        // ItemSelectedState
        first.swipeCard();
        first.cancel();
        first. dispense();
        first.selectItem();
        // PayState
        System.out.println("\n");
        first.selectItem();
        first.dispense();
        first.cancel();
        // ItemSelectedState
        System.out.println("\n");
        first.selectItem();
        first.swipeCard();
        // SoldState
        System.out.println("\n");
        first.swipeCard();
        first.selectItem();

        first.cancel();
        first.selectItem();
        first.swipeCard();

        first.dispense();
        first.swipeCard();
    }
}
