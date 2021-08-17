package com.rawnak;

import com.rawnak.protectedaccess.otherpackage.NonPackageSubClassProtectedAccess;

public class Main {

    public static void main(String[] args) {
        // write your code here
        NonPackageSubClassProtectedAccess nonPackageSubClassProtectedAccess = new NonPackageSubClassProtectedAccess();
        System.out.println(nonPackageSubClassProtectedAccess.name);
    }
}
