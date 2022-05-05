package com.company.pointofsale;

import java.util.Objects;

public class IceCream {
    private String flavor;
    private double price;
    private double quantity;

    public IceCream(String flavor, double price, double quantity) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
    }

    public IceCream() {

    }



    public double totalPrice(){
        return price * quantity;
    }

    public double discountBy10Percent(){
        return totalPrice()* 0.90;
    }


    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.price, price) == 0 && Double.compare(iceCream.quantity, quantity) == 0 && Objects.equals(flavor, iceCream.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, price, quantity);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
