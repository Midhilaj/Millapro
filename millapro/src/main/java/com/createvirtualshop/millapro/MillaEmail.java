package com.createvirtualshop.millapro;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by test on 12/31/16.
 */

public class MillaEmail {
    Activity mactivity;
    public void sentEmial(Activity activity,MillaEmailcontent millaEmailcontent){
        mactivity=activity;
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("plain/text");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { millaEmailcontent.getTomailid() });
        intent.putExtra(Intent.EXTRA_SUBJECT, millaEmailcontent.getSubject());
        intent.putExtra(Intent.EXTRA_TEXT, millaEmailcontent.getMailbody());
        mactivity.startActivity(Intent.createChooser(intent, ""));
    }
}
