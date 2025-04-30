package factory.tsexpress;

import factory.tsexpress.black.BlackMilkTea;
import factory.tsexpress.black.BlackTea;
import factory.tsexpress.green.GreenMilkTea;
import factory.tsexpress.green.GreenTea;

public class MilkTeaFactory implements TeaFactory {

    @Override
    public BlackTea createBlackTea(String sugar, String ice) {
        return new BlackMilkTea(ice, sugar);
    }

    @Override
    public GreenTea createGreenTea(String sugar, String ice) {
        return new GreenMilkTea(ice, sugar);
    }

}
