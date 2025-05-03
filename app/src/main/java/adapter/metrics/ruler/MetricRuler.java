package adapter.metrics.ruler;

public class MetricRuler {
    private double length;
    private double mass;

    public MetricRuler(double length, double mass) {
        this.length = length;
        this.mass = mass;
    }

    public double getLength() {
        return length;
    }

    public double getMass() {
        return mass;
    }
}
