package com.createvirtualshop.millapro;

/**
 * Created by test on 1/1/17.
 */

public class MillaUcfirst {
    public static String Ucfirst(String str){
        if(str!=null){
            if(!str.isEmpty()){
                if(str.trim().length()>0)return str.substring(0, 1).toUpperCase() + str.substring(1); else return str;
            } else return str;
        }
        else return str;
     //   return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
