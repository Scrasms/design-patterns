package adapter.metrics.ruler;

public class ImperialRulerAdapter implements ImperialRuler {
    private MetricRuler iRuler;

    public ImperialRulerAdapter(MetricRuler iRuler) {
        this.iRuler = iRuler;
    }

    @Override
    public void printLength() {
        double inches = iRuler.getLength() * 2.54;
        System.out.println("This ruler is " + inches + " inches long");
    }

    @Override
    public void printMass() {
        double pounds = iRuler.getMass() * 2.2;
        System.out.println("This ruler weighs " + pounds + " pounds");
    }
}
