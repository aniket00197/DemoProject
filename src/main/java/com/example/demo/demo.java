package com.example.demo;

import java.util.Date;

public class demo {

    public static void main(String[] args) {

        Invoice invoice;
        Date date = new Date();
        invoice = new Invoice("My Invoice",date,100.2);

        System.out.println(invoice);
        for (int i = 0; i <10 ; i++) {
            System.out.println("Value of i = "+i);
        }


    }
}
