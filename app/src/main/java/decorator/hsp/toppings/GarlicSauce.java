package decorator.hsp.toppings;

import decorator.hsp.Hsp;
import decorator.hsp.HspDecorator;

public class GarlicSauce extends HspDecorator {

    public GarlicSauce(Hsp hsp) {
        super(hsp);
    }

    @Override
    public String getMeat() {
        return super.getMeat();
    }

    @Override
    public String getToppings() {
        return super.getToppings() + "garlic sauce, ";
    }

}
