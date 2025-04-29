package statePattern;

public class SoldState implements SuperState {
    private VendingMachine machine;

    public SoldState(VendingMachine machine) {
        this.machine = machine;
    }
    public String swipeCard() {
        return "Already paid";
    }

    public String selectItem() {
        return "Already selected";
    }

    public String cancel() {
        machine.setState(new ItemSelectedState(machine));
        return "Cancelled purchase";
    }

    public String dispense() {
        machine.sellStock();
        machine.setState(new ItemSelectedState(machine));
        return "Enjoy!";
    }
   
}