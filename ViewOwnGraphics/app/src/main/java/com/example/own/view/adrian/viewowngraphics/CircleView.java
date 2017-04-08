package com.example.own.view.adrian.viewowngraphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Adrian on 2017-04-08.
 */

public class CircleView extends View {
    private Paint paint = new Paint();

    public CircleView(Context context) {
        super(context);
    }

    public CircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        int xCenter = canvas.getWidth()/2;
        int yCenter = canvas.getHeight()/2;
        int r = 40;
        int R = 200;

        paint.setColor(Color.BLUE);
        canvas.drawCircle(xCenter,yCenter,r, paint);
        paint.setColor(Color.RED);

        for (int i = 0; i < 6; i++) {
            final int xRedCenter = (int) (xCenter + R * Math.cos(2 * Math.PI *i/ 6));
            final int yRedCenter = (int) (yCenter + R * Math.sin(2 * Math.PI *i/ 6));
            canvas.drawCircle(xRedCenter,yRedCenter,r, paint);
        }





    }
}
