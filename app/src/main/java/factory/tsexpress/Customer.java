package factory.tsexpress;

import java.util.List;

import factory.tsexpress.black.BlackTea;
import factory.tsexpress.green.GreenTea;

public class Customer {
    private String name;
    private TeaFactory factory;

    public Customer(String name, TeaFactory factory) {
        this.name = name;
        this.factory = factory;
    }

    public void orderGreenTea(String ice, String sugar) {
        GreenTea g = factory.createGreenTea(sugar, ice);
        System.out.println(name + " ordered a " + g.getName() + " with " + g.getIce() + " ice, "
        + g.getSugar() + " sugar, and " + g.getTopping());
    }

    public void orderBlackTea(String ice, String sugar) {
        BlackTea g = factory.createBlackTea(sugar, ice);
        System.out.println(name + " ordered a " + g.getName() + " with " + g.getIce() + " ice, "
        + g.getSugar() + " sugar, and " + g.getTopping());
    }

    public static void main(String[] args) {
        Customer kevin = new Customer("kevin", new TeaLatteFactory());
        Customer alex = new Customer("alex", new MilkTeaFactory());
        int randIce;
        int randSugar;
        for (int i = 0; i < 5; i++) {
            List<String> ices = List.of("none", "less", "full");
            List<String> sugars = List.of("none", "low", "full");
            randIce = (int) (Math.random() * ices.size());
            randSugar = (int) (Math.random() * sugars.size());
            kevin.orderBlackTea(ices.get(randIce), sugars.get(randSugar));
            randIce = (int) (Math.random() * ices.size());
            randSugar = (int) (Math.random() * sugars.size());
            kevin.orderGreenTea(ices.get(randIce), sugars.get(randSugar));
            randIce = (int) (Math.random() * ices.size());
            randSugar = (int) (Math.random() * sugars.size());
            alex.orderBlackTea(ices.get(randIce), sugars.get(randSugar));
            randIce = (int) (Math.random() * ices.size());
            randSugar = (int) (Math.random() * sugars.size());
            alex.orderGreenTea(ices.get(randIce), sugars.get(randSugar));
        }
    }
}
