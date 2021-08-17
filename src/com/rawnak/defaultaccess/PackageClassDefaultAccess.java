package com.rawnak.defaultaccess;

public class PackageClassDefaultAccess {
    DefaultAccess defaultAccess = new DefaultAccess();

    void function(){
        // Accessing from the same package
        System.out.println(defaultAccess.roll);
//        System.out.println(defaultAccess.name);
    }
}
