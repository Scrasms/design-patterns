package visitor.shopping;

public class PriceVisitor implements CartVisitor {
    private double totalCost;

    @Override
    public void visit(Boots boots) {
        totalCost += boots.getPrice();
    }

    @Override
    public void visit(Tent tent) {
        totalCost += tent.getPrice() - (tent.getPrice() * tent.getDiscount() / 100);
    }

    @Override
    public void visit(Rations rations) {
        totalCost += rations.getPrice() + (rations.getPrice() * rations.getTax() / 100);
    }

    public double getTotalCost() {
        return totalCost;
    }
}
