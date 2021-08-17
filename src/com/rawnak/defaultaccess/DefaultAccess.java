package com.rawnak.defaultaccess;

public class DefaultAccess {

    // Default access modifier
    int roll = 100;
//    protected int roll = 100;
    public String name = "Rawnak";

    // Accessing from the scope of the same class
    void function() {
        roll += 6;
    }
}
