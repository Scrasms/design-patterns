package state.vendingmachine;

public interface SuperState {
    public String swipeCard();
    public String selectItem();
    public String cancel();
    public String dispense();
}
