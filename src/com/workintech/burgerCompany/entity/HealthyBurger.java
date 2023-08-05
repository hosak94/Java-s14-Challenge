package com.workintech.burgerCompany.entity;

public class HealthyBurger extends Hamburger{
    private String healthyExtraName1;
    private double healthyExtra1Price;
    private String healthyExtraName2;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, BreadRollType breadRollType) {
        super(name, price, breadRollType);
        super.setMeat("Tofu");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtraName1 = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String name, double price) {
        this.healthyExtraName2 = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        String explanation = super.itemize();
        System.out.println(explanation);
        StringBuilder builder = new StringBuilder();
        if(healthyExtraName1 != null){
            builder.append("HealthyAddition1: "+ healthyExtraName1+ "\n");
        }
        if(healthyExtraName2 != null){
            builder.append("HealthyAddition2: "+ healthyExtraName2+ "\n");
        }

        double healthyPrice = getPrice()+healthyExtra1Price +healthyExtra2Price;
        builder.append("Total Price: "+healthyPrice);
        System.out.println(builder.toString());
        System.out.println("--------------");
        return healthyPrice;
    }
}
