package decorator.hsp;

public abstract class HspDecorator implements Hsp {
    private Hsp wrapper;

    public HspDecorator(Hsp hsp) {
        this.wrapper = hsp;
    }

    @Override
    public String getMeat() {
        return wrapper.getMeat();
    }

    @Override
    public String getToppings() {
        return wrapper.getToppings();
    }


}
