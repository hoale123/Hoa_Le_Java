package com.company;

import com.company.pointofsale.IceCream;
//import com.company.factory.IceCream;


public class IceCreamApplication {
    public static void main(String[] args) {
        // point of sale
        System.out.println("Point of Sales");
        IceCream posIceCream1 = new IceCream("Vanilla",5,1);
        // factory
//        IceCream factoryIceCream1 = new IceCream("Vanilla",1.5,0.5,.03,.02);
        System.out.println("Factory");

        IceCream factoryIceCream1 = new com.company.factory.IceCream("Vanilla",5,3,1,2);
        System.out.println(factoryIceCream1);
        System.out.println("Vanilla Sale price = " +posIceCream1.getPrice()+" Vanilla ice cream with 10% discount = " + posIceCream1.discountBy10Percent());
    }
}
