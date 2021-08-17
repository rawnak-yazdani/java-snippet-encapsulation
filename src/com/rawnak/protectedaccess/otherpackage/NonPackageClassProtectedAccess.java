package com.rawnak.protectedaccess.otherpackage;

import com.rawnak.protectedaccess.ProtectedAccess;

public class NonPackageClassProtectedAccess {
    ProtectedAccess protectedAccess = new ProtectedAccess();

    void function(){
        // Cannot be accessed form other package
//        System.out.println(protectedAccess.roll);
    }
}
