package com.company;

public class CustomerApp {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setFirstName("Hoa");
        System.out.println(customer.getFirstName());
        customer.setLastName("Le");
        customer.setEmail("Hoa@yahoo.com");
        customer.setPhoneNumber("404-404-4040");
        customer.setRewardsMember(false);
        customer.isRewardMemberOrNot();
//        System.out.println(customer);

        System.out.println("================");
        System.out.println("Shipping address");
        Address shippingAddress = new Address();
        shippingAddress.setStreet1("123 Atlanta");
        shippingAddress.setStreet2("456 Atlanta");
        shippingAddress.setCity("Atlanta");
        shippingAddress.setState("Georgia");
        shippingAddress.setZipcode("12345");

        Address billingAddress = new Address();
        billingAddress.setStreet1("123 Decatur");
        billingAddress.setStreet2("456 Decatur");
        billingAddress.setCity("Decatur");
        billingAddress.setState("Georgia");
        billingAddress.setZipcode("67890");

        customer.setShippingAddress(shippingAddress);

        customer.setBillingAddress(billingAddress);
        System.out.println(customer);



    }
}
