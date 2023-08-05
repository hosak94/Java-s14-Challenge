package com.workintech.burgerCompany.entity;

public class Hamburger implements Addable {
    private String name;
    private BreadRollType breadRollType;
    private String meat;
    private double price;
    private Addition[] additions = new Addition[4];

    public Hamburger(String name, double price, BreadRollType breadRollType) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = "Normal";
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public void addAddition(String additionName, double price) {
          for(int i=0; i<additions.length;i++) {
              if(additions[i] == null) {
                  additions[i] = new Addition(additionName,price);
                  price += price;
                  return;
              }
          }
        System.out.println("Burger is full");
    }

    public String itemize() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: "+ name + "\n");
        builder.append("Meat: "+ meat + "\n");
        builder.append("BreadRollType: "+ breadRollType + "\n");

      for (Addition addition: additions){
          if(addition != null) {
              builder.append("Addition: "+addition.getAdditionName() + "\n");
              price += addition.getAdditionPrice();
          }
      }
        return builder.toString();

    }

    public double itemizeHamburger() {
        String explanation = itemize();
        System.out.println(explanation);
        System.out.println("Price: "+ getPrice());
        System.out.println("-------------------------");
        return getPrice();
    }


}
