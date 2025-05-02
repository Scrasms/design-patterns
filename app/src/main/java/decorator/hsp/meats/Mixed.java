package decorator.hsp.meats;

import decorator.hsp.Hsp;

public class Mixed implements Hsp {

    @Override
    public String getMeat() {
        return "Mixed";
    }

    @Override
    public String getToppings() {
        return "This mixed hsp has: ";
    }

}

