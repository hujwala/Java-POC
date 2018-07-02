package com.example.Java_Poc.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validator {

    public static final int validateName(String aName){

        if(aName == null || aName.equals("")){
            return  1;
        }else{
            if(!aName.matches("^[a-zA-Z]+(\\s[a-zA-Z]+)?$"))
                return 1;
        }
        return 0;
    }

    public static final int validatePhoneNumber(String aPhoneNumber){
        if(aPhoneNumber.length() == 10){
            return 0;

        }else{
            if (!aPhoneNumber.matches("^[0-9]"))
                return 4;
        }
        return 2;
    }

    public static final int validateEmail(String aEmail){
        if (!aEmail.matches("^\\w+[\\w-\\.]*\\@\\w+((-\\w+)|(\\w*))\\.[a-z]{3}$")){
            return 5;
        }
        return 0;
    }

    public static final int validatepassword(String aPassword){
        if (!aPassword.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&]).{8,}")){
            return 6;
        }
        return 0;
    }
    public static final int validateanuual(String aAnnual){
        if (!aAnnual.matches("^[0-9]+$")){
            return 7;
        }
        return 0;
    }

    /*public static final int validateDate(String aDate){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        try
        {
            Date birthDate = sdf.parse(aDate);
            System.out.println(aDate+ "Is Valid");
            return 8;
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println(aDate+ "Is InValid");
            return 9;
        }
    }*/
}
