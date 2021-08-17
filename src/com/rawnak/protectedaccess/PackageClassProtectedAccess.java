package com.rawnak.protectedaccess;

public class PackageClassProtectedAccess {
    ProtectedAccess protectedAccess = new ProtectedAccess();

    void function(){
        // Accessing from the same package
        System.out.println(protectedAccess.roll);
//        System.out.println(defaultAccess.name);
    }
}
