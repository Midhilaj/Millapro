package com.createvirtualshop.millapro;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.widget.Toast;

/**
 * Created by test on 1/1/17.
 */

public class MillaDevice {
  public static void showResulation(Activity activity) {
      try {
          DisplayMetrics displaymetrics = new DisplayMetrics();
          activity.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
          int height = displaymetrics.heightPixels;
          int width = displaymetrics.widthPixels;
          Toast.makeText(activity.getApplicationContext(), "hight and width is " + height + " :  " + width, Toast.LENGTH_LONG).show();
      } catch (Exception e) {
      }
  }
}
