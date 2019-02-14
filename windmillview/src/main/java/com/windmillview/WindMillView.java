package com.windmillview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by HARRY on 2019/2/14 0014.
 */

public class WindMillView extends View{

    public WindMillView(Context context) {
        this(context,null);
    }

    public WindMillView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public WindMillView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context,attrs);
    }

    private void initView(Context context, AttributeSet attrs) {

    }


}
