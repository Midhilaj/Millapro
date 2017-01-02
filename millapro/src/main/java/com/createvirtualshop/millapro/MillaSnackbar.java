package com.createvirtualshop.millapro;

import android.view.View;

/**
 * Created by test on 1/1/17.
 */
import android.support.design.widget.Snackbar;


public class MillaSnackbar {
    public static void Showsnack(View view, String mess, String len){
        Snackbar.make(view, mess, (len.equals("long")?Snackbar.LENGTH_LONG:Snackbar.LENGTH_SHORT))
                .setAction("Action", null).show();
    }
}
