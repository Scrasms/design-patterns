package gumballstate;

public class ItemSelectedState implements SuperState {
    private VendingMachine machine;

    public ItemSelectedState(VendingMachine machine) {
        this.machine = machine;
    }

    public String swipeCard() {
        return "Haven't selected item";
    }

    public String selectItem() {
        if (machine.getStock() > 0) {
            machine.setState(new PayState(machine));
            return "Item selected";
        }

        machine.setState(new SoldOutState(machine));
        return "Out of stock";
    }

    public String cancel() {
        return "Haven't selected item";
    }

    public String dispense() {
        return "Haven't selected item";
    }
}
