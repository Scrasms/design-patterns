package adapter.metrics;

import adapter.metrics.ruler.ImperialRulerAdapter;
import adapter.metrics.ruler.MetricRuler;

public class Client {
    public static void main(String[] args) {
        MetricRuler mRuler = new MetricRuler(10, 5);
        ImperialRulerAdapter iRuler = new ImperialRulerAdapter(mRuler);
        iRuler.printLength();
        iRuler.printMass();
    }
}
