package gumballstate;

public class SoldOutState implements SuperState {
    private VendingMachine machine;

    public SoldOutState(VendingMachine machine) {
        this.machine = machine;
    }
    public String swipeCard() {
        return "Machine Sold out";
    }

    public String selectItem() {
        return "Machine Sold out";
    }

    public String cancel() {
        return "Machine Sold out";
    }

    public String dispense() {
        return "Machine Sold out";
    }
}
