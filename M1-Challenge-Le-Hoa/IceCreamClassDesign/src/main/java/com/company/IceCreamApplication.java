package com.company;

import com.company.pointofsale.IceCream;


public class IceCreamApplication {
    public static void main(String[] args) {

        // point of sale
        System.out.println("Point of Sales");
        IceCream posIceCream1 = new IceCream("Vanilla",5,10);
        System.out.println(posIceCream1.totalPrice());
        System.out.println("Vanilla Sale price = " +posIceCream1.getPrice()+" Vanilla ice cream with 10% discount = " + posIceCream1.discountBy10Percent());
        // factory
        System.out.println("Factory");

        com.company.factory.IceCream factoryIceCream1 = new com.company.factory.IceCream("vanilla",17,5,4,1);
        System.out.println(factoryIceCream1);
        System.out.println(factoryIceCream1.profit());
        System.out.println(factoryIceCream1.productionCost());

    }
}
