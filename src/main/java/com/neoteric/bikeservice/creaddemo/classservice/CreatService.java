package com.neoteric.bikeservice.creaddemo.classservice;

import com.neoteric.bikeservice.creaddemo.Customer;
import com.neoteric.bikeservice.creaddemo.Otp;

public class CreatService {
    public Otp registrstion(Customer customer){
        Otp otp = new Otp();
        //object reference only know the location of object form Ram
        otp.custmerId = "1234";
        otp.otp = "6475";
        otp.mobileNumber = "35435765";
        return otp;

    }
}
