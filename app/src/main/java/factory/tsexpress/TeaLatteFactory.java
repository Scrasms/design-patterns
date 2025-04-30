package factory.tsexpress;

import factory.tsexpress.black.BlackTea;
import factory.tsexpress.black.BlackTeaLatte;
import factory.tsexpress.green.GreenTea;
import factory.tsexpress.green.GreenTeaLatte;

public class TeaLatteFactory implements TeaFactory {

    @Override
    public BlackTea createBlackTea(String sugar, String ice) {
        return new BlackTeaLatte(ice, sugar);
    }

    @Override
    public GreenTea createGreenTea(String sugar, String ice) {
        return new GreenTeaLatte(ice, sugar);
    }
}
