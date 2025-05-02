package decorator.hsp.meats;

import decorator.hsp.Hsp;

public class Chicken implements Hsp {

    @Override
    public String getMeat() {
        return "Chicken";
    }

    @Override
    public String getToppings() {
        return "This chicken hsp has: ";
    }

}
