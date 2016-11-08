package com.github.akashandroid90.vectorview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

import com.github.akashandroid90.vectorview.utils.VectorUtils;

import app.vectorview.R;

/**
 * Created by admin1 on 7/11/16.
 */

public class VectorCompatEditText extends AppCompatEditText {
    private ColorStateList mTint;
    public VectorCompatEditText(Context context) {
        this(context, null);
    }

    public VectorCompatEditText(Context context, AttributeSet attrs) {
        this(context, attrs, android.support.v7.appcompat.R.attr.editTextStyle);
    }

    public VectorCompatEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.TintableView, defStyleAttr, 0);
        mTint = a.getColorStateList(R.styleable.TintableView_tint);
        a.recycle();
    }

    @Override
    public void setCompoundDrawablesWithIntrinsicBounds(int left, int top, int right, int bottom) {
        Context context = getContext();
        Drawable leftDrawable = left != 0 ? AppCompatResources.getDrawable(context, left) : null;
        if(leftDrawable!=null && mTint!=null){
            if(mTint.isStateful())
                VectorUtils.tintDrawable(context,leftDrawable,mTint.getColorForState(getDrawableState(), 0));
            else VectorUtils.tintDrawable(leftDrawable,mTint);
        }
        Drawable topDrawable = top != 0 ? AppCompatResources.getDrawable(context, top) : null;
        if(topDrawable!=null && mTint!=null){
            if(mTint.isStateful())
                VectorUtils.tintDrawable(context,topDrawable,mTint.getColorForState(getDrawableState(), 0));
            else VectorUtils.tintDrawable(topDrawable,mTint);
        }
        Drawable rightDrawable = right != 0 ? AppCompatResources.getDrawable(context, right) : null;
        if(rightDrawable!=null && mTint!=null){
            if(mTint.isStateful())
                VectorUtils.tintDrawable(context,rightDrawable,mTint.getColorForState(getDrawableState(), 0));
            else VectorUtils.tintDrawable(rightDrawable,mTint);
        }
        Drawable bottomDrawable = bottom != 0 ? AppCompatResources.getDrawable(context, bottom) : null;
        if(bottomDrawable!=null && mTint!=null){
            if(mTint.isStateful())
                VectorUtils.tintDrawable(context,bottomDrawable,mTint.getColorForState(getDrawableState(), 0));
            else VectorUtils.tintDrawable(bottomDrawable,mTint);
        }
        setCompoundDrawablesWithIntrinsicBounds(leftDrawable, topDrawable, rightDrawable, bottomDrawable);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int start, int top, int end, int bottom) {
        Context context = getContext();
        Drawable startDrawable = start != 0 ? AppCompatResources.getDrawable(context, start) : null;
        if(startDrawable!=null && mTint!=null){
            if(mTint.isStateful())
                VectorUtils.tintDrawable(context,startDrawable,mTint.getColorForState(getDrawableState(), 0));
            else VectorUtils.tintDrawable(startDrawable,mTint);
        }
        Drawable topDrawable = top != 0 ? AppCompatResources.getDrawable(context, top) : null;
        if(topDrawable!=null && mTint!=null){
            if(mTint.isStateful())
                VectorUtils.tintDrawable(context,topDrawable,mTint.getColorForState(getDrawableState(), 0));
            else VectorUtils.tintDrawable(topDrawable,mTint);
        }
        Drawable endDrawable = end != 0 ? AppCompatResources.getDrawable(context, end) : null;
        if(endDrawable!=null && mTint!=null){
            if(mTint.isStateful())
                VectorUtils.tintDrawable(context,endDrawable,mTint.getColorForState(getDrawableState(), 0));
            else VectorUtils.tintDrawable(endDrawable,mTint);
        }
        Drawable bottomDrawable = bottom != 0 ? AppCompatResources.getDrawable(context, bottom) : null;
        if(bottomDrawable!=null && mTint!=null){
            if(mTint.isStateful())
                VectorUtils.tintDrawable(context,bottomDrawable,mTint.getColorForState(getDrawableState(), 0));
            else VectorUtils.tintDrawable(bottomDrawable,mTint);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(startDrawable, topDrawable, endDrawable, bottomDrawable);
    }

    @Override
    public void setBackgroundResource(int resid) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN)
            setBackground(resid != 0 ? AppCompatResources.getDrawable(getContext(), resid) : null);
        else
            setBackgroundDrawable(resid != 0 ? AppCompatResources.getDrawable(getContext(), resid) : null);
    }
    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Context context=getContext();
        Drawable[] compoundDrawables = getCompoundDrawables();
        Drawable compoundDrawable=compoundDrawables[0];
        if(compoundDrawable!=null && mTint!=null){
            if(mTint.isStateful())
                VectorUtils.tintDrawable(context,compoundDrawable,mTint.getColorForState(getDrawableState(), 0));
            else VectorUtils.tintDrawable(compoundDrawable,mTint);
        }
        compoundDrawable=compoundDrawables[1];
        if(compoundDrawable!=null && mTint!=null){
            if(mTint.isStateful())
                VectorUtils.tintDrawable(context,compoundDrawable,mTint.getColorForState(getDrawableState(), 0));
            else VectorUtils.tintDrawable(compoundDrawable,mTint);
        }
        compoundDrawable=compoundDrawables[2];
        if(compoundDrawable!=null && mTint!=null){
            if(mTint.isStateful())
                VectorUtils.tintDrawable(context,compoundDrawable,mTint.getColorForState(getDrawableState(), 0));
            else VectorUtils.tintDrawable(compoundDrawable,mTint);
        }
        compoundDrawable=compoundDrawables[3];
        if(compoundDrawable!=null && mTint!=null){
            if(mTint.isStateful())
                VectorUtils.tintDrawable(context,compoundDrawable,mTint.getColorForState(getDrawableState(), 0));
            else VectorUtils.tintDrawable(compoundDrawable,mTint);
        }
    }
}
