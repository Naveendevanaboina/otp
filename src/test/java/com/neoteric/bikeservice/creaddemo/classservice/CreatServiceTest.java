package com.neoteric.bikeservice.creaddemo.classservice;

import com.neoteric.bikeservice.creaddemo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreatServiceTest {
    @Test
    public void test(){
        Customer customer = new Customer();


        customer.name="naveen";
        customer.customerLoginId="564684";
        customer.password="5465";
        customer.age= 21;
        customer.phoneNumber=354657435;

        Address address = new Address();
        address.area="kphb";
        address.city="hyd";
        address.flatNumber=44;

        IfscCode ifscCode = new IfscCode();
        ifscCode.code="222";
        ifscCode.address=address;

        Account account = new Account();
        account.accountNumber="54534";
        account.address=address;
        account.avalibleBalance=5000;
        account.currentBalance=5000;
        account.ifscCode=ifscCode;



        RateOfIntrest rateOfIntrest = new RateOfIntrest();
        rateOfIntrest.accountType="savings";
        rateOfIntrest.IntrestPresantage=10;
        String expectedOtp="6475";

        CreatService creatService = new CreatService();
        Otp test= creatService.registrstion(customer);
        Assertions.assertNotNull(test);
        Assertions.assertEquals(expectedOtp,test.otp);

    }

}