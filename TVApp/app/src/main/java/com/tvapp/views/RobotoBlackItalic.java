package com.tvapp.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by shrinivas on 21-11-2016.
 */
public class RobotoBlackItalic extends TextView {
    public RobotoBlackItalic(Context context) {
        super(context);
        init();
    }

    public RobotoBlackItalic(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RobotoBlackItalic(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init()
    {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-BlackItalic.ttf");
        setTypeface(tf);

    }
}

