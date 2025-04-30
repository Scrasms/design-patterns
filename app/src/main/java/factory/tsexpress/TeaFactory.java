package factory.tsexpress;

import factory.tsexpress.black.BlackTea;
import factory.tsexpress.green.GreenTea;

public interface TeaFactory {
    public BlackTea createBlackTea(String sugar, String ice);
    public GreenTea createGreenTea(String sugar, String ice);
}

