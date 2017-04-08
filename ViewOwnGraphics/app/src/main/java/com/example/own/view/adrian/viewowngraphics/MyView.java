package com.example.own.view.adrian.viewowngraphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 2017-04-08.
 */

public class MyView extends View {
    public static final int CENTER = 200;
    public static final int RADIUS = 80;
    public static final DashPathEffect EFFECT = new DashPathEffect(new float[]{50, 20}, 0);
    private Paint paint = new Paint();
    private List<Circle> circles;

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
        creataCirlesIfNotExists(canvas);
        for (Circle circle : circles) {
            circle.draw(canvas);
        }

    }

    private void creataCirlesIfNotExists(Canvas canvas) {
        if (circles == null) {
            circles = new ArrayList<>();
            final int numerX = 6;
            final int numerY = 3;
            final int xGap = canvas.getWidth() / numerX;
            final int yGap = canvas.getHeight() / numerY;
            final int v = 4;
            final int r = Math.min(xGap, yGap)/2- v;
            final int xStart = xGap/2;
            final int yStart = yGap/2;

            for (int i = 0; i < numerX; i++) {
                int x = xStart + i * xGap;
                for (int j = 0; j < numerY; j++) {

                    int y = yStart + j * yGap;
                    circles.add(new Circle(x, y, r));
                }
            }
        }
    }

    private class Circle {
        private int x;
        private int y;
        private int r;

        private Circle(int x, int y, int r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }


        private void draw(Canvas canvas){
            canvas.drawCircle(x,y,r, paint);
        }
    }
}
