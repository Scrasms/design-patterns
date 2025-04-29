package vendingstate;

public class PayState implements SuperState {
    private VendingMachine machine;

    public PayState(VendingMachine machine) {
        this.machine = machine;
    }
    public String swipeCard() {
        if (machine.getCard()) {
            machine.setState(new SoldState(machine));
            return "Card swipe worked";
        }

        machine.setState(new ItemSelectedState(machine));
        return "Card failed, return to selecting item";
    }

    public String selectItem() {
        return "Already selected";
    }

    public String cancel() {
        machine.setState(new ItemSelectedState(machine));
        return "Cancelled, back to selection";
    }

    public String dispense() {
        return "Pay first";
    }
}
