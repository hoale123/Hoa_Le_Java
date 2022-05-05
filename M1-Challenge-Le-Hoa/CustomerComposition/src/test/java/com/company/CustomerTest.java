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
    public void setUp(){customer = new Customer();}
    @Before
    public void setUpShippingAddress(){shippingAddress = new Address();}

    @Before
    public void  setBillingAddress(){billingAddress = new Address();}

    @Test
    public void isRewardMember(){
        customer.isRewardMember();
       assertTrue(customer.isRewardsMember());
    }
    @Test
    public void correctEmail(){
        customer.setEmail("Hoa@yahoo.com");
        assertEquals("Hoa@yahoo.com",customer.getEmail());
    }

    @Test
    public void correctShippingCity(){
        shippingAddress.setCity("Atlanta");
        assertEquals("Atlanta",shippingAddress.getCity());
    }

    @Test
    public void correctBillingCity(){
        billingAddress.setCity("Decatur");
        assertEquals("Decatur",billingAddress.getCity());
    }
}