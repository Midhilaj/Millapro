package com.createvirtualshop.millapro;

import android.app.Activity;
import android.content.Intent;
import android.renderscript.Float2;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by test on 12/31/16.
 */

public class MillaMoveFreeView {
    Activity mactivity;
    View mview;
    Float dX,dY;
    MillaViewFreeCallback mmillaViewFreeCallback;
    public MillaMoveFreeView(Activity activity,MillaViewFreeCallback millaViewFreeCallback) {
        mmillaViewFreeCallback=millaViewFreeCallback;
        mactivity = activity;
    }
    public void makeviewfree(View gview) {
        mview=gview;
        final GestureDetector gestureDetector = new GestureDetector(mactivity, new SingleTapConfirm());
        mview.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (gestureDetector.onTouchEvent(event)) {
                    // single tap
                    mmillaViewFreeCallback.Millasingleclick();
                    return true;
                } else {
                    // mmillaViewFreeCallback.MillaMoving();
                    // your code for move and drag
                    switch (event.getAction()) {

                        case MotionEvent.ACTION_DOWN:
                            dX = view.getX() - event.getRawX();
                            dY = view.getY() - event.getRawY();
                            break;
                        case MotionEvent.ACTION_MOVE:
                            view.animate().x(event.getRawX() + dX).y(event.getRawY() + dY).setDuration(0).start();
                            break;
                        default:
                            return false;
                    }
                    return true;
                }
            }
        });
    }
    class SingleTapConfirm extends GestureDetector.SimpleOnGestureListener {

        @Override
        public boolean onSingleTapUp(MotionEvent event) {
            return true;
        }
    }
}
