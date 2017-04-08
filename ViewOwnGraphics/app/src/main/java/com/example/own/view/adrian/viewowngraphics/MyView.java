package com.example.own.view.adrian.viewowngraphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Adrian on 2017-04-08.
 */

public class MyView extends View {
    public static final int CENTER = 200;
    public static final int RADIUS = 80;
    public static final DashPathEffect EFFECT = new DashPathEffect(new float[]{50, 20}, 0);
    private Paint paint = new Paint();

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(CENTER, CENTER, RADIUS, paint);
        paint.setStrokeWidth(20);
        paint.setPathEffect(EFFECT);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(CENTER, CENTER, RADIUS, paint);

    }
}
