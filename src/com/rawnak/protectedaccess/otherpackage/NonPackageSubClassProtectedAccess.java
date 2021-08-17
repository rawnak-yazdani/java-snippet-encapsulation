package com.rawnak.protectedaccess.otherpackage;

import com.rawnak.protectedaccess.ProtectedAccess;

public class NonPackageSubClassProtectedAccess extends ProtectedAccess {
    ProtectedAccess protectedAccess = new ProtectedAccess();

    void functionFromSubClass(){
        // Cannot be accessed from subclass within other package with superclass object
//        System.out.println(protectedAccess.roll);

        // But can be accessed from subclass within other package with subclass object
        NonPackageSubClassProtectedAccess nonPackageSubClassProtectedAccess = new NonPackageSubClassProtectedAccess();
        System.out.println(nonPackageSubClassProtectedAccess.roll);
    }
}
