package com.company.factory;

import java.util.Objects;

public class IceCream extends com.company.pointofsale.IceCream {
    private String flavor;
    private double salePrice;
    private double productionCost;

    private double ingredientsCost;

    private double laborCost;

    public IceCream(String flavor, double salePrice, double productionCost, double ingredientsCost, double laborCost) {
        super();
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.ingredientsCost = ingredientsCost;
        this.laborCost = laborCost;
    }

//    public String flavorName(){
////        System.out.println(flavor);
//        return flavor;
//    }

    public double productionCost(){
        return laborCost + ingredientsCost;

    }
    public double profit(){
        return salePrice - productionCost;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public double getIngredientsCost() {
        return ingredientsCost;
    }

    public void setIngredientsCost(double ingredientsCost) {
        this.ingredientsCost = ingredientsCost;
    }

    public double getLaborCost() {
        return laborCost;
    }

    public void setLaborCost(double laborCost) {
        this.laborCost = laborCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.salePrice, salePrice) == 0 && Double.compare(iceCream.productionCost, productionCost) == 0 && Double.compare(iceCream.ingredientsCost, ingredientsCost) == 0 && Double.compare(iceCream.laborCost, laborCost) == 0 && Objects.equals(flavor, iceCream.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, salePrice, productionCost, ingredientsCost, laborCost);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", salePrice=" + salePrice +
                ", productionCost=" + productionCost +
                ", ingredientsCost=" + ingredientsCost +
                ", laborCost=" + laborCost +
                '}';
    }
}
