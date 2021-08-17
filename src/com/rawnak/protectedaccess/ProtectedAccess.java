package com.rawnak.protectedaccess;

public class ProtectedAccess {

    // protected access modifier
    protected int roll = 100;
    // int roll = 100;
    public String name = "Rawnak";

    // Accessing from the scope of the same class
    protected void function() {
        roll += 6;
    }
}
