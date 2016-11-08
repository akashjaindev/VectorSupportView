package com.github.akashandroid90.vectorview.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorRes;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;

/**
 * Created by admin1 on 8/11/16.
 */

public class VectorUtils {
    public static void tintDrawable(Context context, Drawable drawable,@ColorRes int color) {
        if (context == null)
            throw new NullPointerException("instance of context can not be null");
        if (drawable == null)
            throw new NullPointerException("instance of drawable can not be null");
        Drawable wrap = DrawableCompat.wrap(drawable);
        wrap = wrap.mutate();
        DrawableCompat.setTint(wrap, ContextCompat.getColor(context, color));
        DrawableCompat.setTintMode(wrap, PorterDuff.Mode.SRC_IN);
    }
    public static void tintDrawable(Drawable drawable,ColorStateList color) {
        if (drawable == null)
            throw new NullPointerException("instance of drawable can not be null");
        Drawable wrap = DrawableCompat.wrap(drawable);
        wrap = wrap.mutate();
        DrawableCompat.setTintList(wrap, color);
        DrawableCompat.setTintMode(wrap, PorterDuff.Mode.SRC_IN);
    }
}
