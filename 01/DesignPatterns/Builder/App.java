package DesignPatterns.Builder;

public class App {
    public static void main(String[] args) {
         Pizza pizza = new Pizza.Builder().build();
        System.out.println("Pizza: " + pizza.getDough() + " dough, " + pizza.getSauce() + " sauce, " + pizza.getTopping() + " topping");

        Pizza customPizza = new Pizza.Builder()
                                    .setDough("Thin Crust")
                                    .setSauce("Barbecue")
                                    .setTopping("Chicken")
                                    .build();
        System.out.println("Custom Pizza: " + customPizza.getDough() + " dough, " + customPizza.getSauce() + " sauce, " + customPizza.getTopping() + " topping");
    }
}
