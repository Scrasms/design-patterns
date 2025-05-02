package decorator.hsp.meats;

import decorator.hsp.Hsp;

public class Beef implements Hsp {

    @Override
    public String getMeat() {
        return "Beef";
    }

    @Override
    public String getToppings() {
        return "This beef hsp has: ";
    }

}
