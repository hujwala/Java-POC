package com.example.Java_Poc.utils;

public class Validator {

    public static final int validateName(String aName){

        if(aName == null || aName.equals("")){
            return  1;
        }
        return 0;
    }

    public static final int validatePhoneNumber(String aPhoneNumber){
        if(aPhoneNumber.length() == 10)
            return 0;
        return 2;
    }

}
