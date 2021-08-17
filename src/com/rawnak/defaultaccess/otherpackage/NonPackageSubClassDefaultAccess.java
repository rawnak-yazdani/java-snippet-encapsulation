package com.rawnak.defaultaccess.otherpackage;

import com.rawnak.defaultaccess.DefaultAccess;

public class NonPackageSubClassDefaultAccess extends DefaultAccess {
    DefaultAccess defaultAccess = new DefaultAccess();

    void function(){
        // Cannot be accessed from subclass within other package with superclass object
//        System.out.println(defaultAccess.roll);

        // Also cannot be accessed from subclass within other package with subclass object
//        NonPackageSubClassDefaultAccess nonPackageSubClassDefaultAccess = new NonPackageSubClassDefaultAccess();
//        System.out.println(nonPackageSubClassDefaultAccess.roll);
    }
}
