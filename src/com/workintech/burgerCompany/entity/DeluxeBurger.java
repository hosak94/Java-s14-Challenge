package com.workintech.burgerCompany.entity;

public class DeluxeBurger extends Hamburger{
    private String drink;
    private String cips;

    public DeluxeBurger() {
        super("Deluxe Burger", 19.10, BreadRollType.DOUBLE_BURGER);
        super.setMeat("Double");
    }

    @Override
    public void addAddition(String additionName, double price) {
        System.out.println("Deluxe Burger için malzeme eklenemez");
    }
}
