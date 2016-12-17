package com.codescv;

/**
 * Created by czzha on 12/17/16.
 */
public class Business {
    @Profile
    public int doOperation() {
        System.out.println("do business logic !");
        return 1;
    }

    public void doOpWithoutProf() {
        System.out.println("do logic without prof");
    }
}
