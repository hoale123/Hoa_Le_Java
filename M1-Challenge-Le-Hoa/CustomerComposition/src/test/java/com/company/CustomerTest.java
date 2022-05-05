package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CustomerTest {
    Customer customer;
    Address shippingAddress;
    Address billingAddress;

    @Before
    public void setUp(){
        customer = new Customer();
        customer.setFirstName("Hoa");
        customer.setLastName("Le");
        customer.setEmail("Hoa@yahoo.com");
        customer.setPhoneNumber("404-404-4040");
        customer.setRewardsMember(false);
        customer.isRewardMemberOrNot();


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
    }
 void  setBillingAddress(){billingAddress = new Address();}

    @Test
    public void isRewardMember(){
        customer.isRewardMember();
       assertTrue(customer.isRewardsMember());
    }
    @Test
    public void correctCustomerInfo(){
        assertEquals("Hoa@yahoo.com",customer.getEmail());
        assertEquals("Le",customer.getLastName());
        assertEquals("Hoa",customer.getFirstName());
        assertEquals("404-404-4040",customer.getPhoneNumber());
    }

    @Test
    public void correctShippingInfo(){
        assertEquals("Atlanta", customer.getShippingAddress().getCity());
        assertEquals("123 Atlanta",customer.getShippingAddress().getStreet1());
        assertEquals("456 Atlanta",customer.getShippingAddress().getStreet2());
        assertEquals("Georgia",customer.getShippingAddress().getState());
        assertEquals("12345",customer.getShippingAddress().getZipcode());

    }

    @Test
    public void correctBillingInfo(){
        assertEquals("Decatur",customer.getBillingAddress().getCity());
        assertEquals("123 Decatur",customer.getBillingAddress().getStreet1());
        assertEquals("456 Decatur",customer.getBillingAddress().getStreet2());
        assertEquals("Georgia",customer.getBillingAddress().getState());
        assertEquals("67890",customer.getBillingAddress().getZipcode());
    }
}