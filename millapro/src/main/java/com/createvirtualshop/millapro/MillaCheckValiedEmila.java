package com.createvirtualshop.millapro;

/**
 * Created by test on 12/31/16.
 */

public class MillaCheckValiedEmila {
    public static  Boolean isValied(String target){
        if (target == null) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }
}
