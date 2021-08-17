package com.rawnak.defaultaccess.otherpackage;

import com.rawnak.defaultaccess.DefaultAccess;

public class NonPackageClassDefaultAccess {
    DefaultAccess defaultAccess = new DefaultAccess();

    void function() {
        // Cannot be accessed form other package
//        System.out.println(defaultAccess.roll);
        System.out.println(defaultAccess.name);
    }
}
