package com.example.primitives;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating a Bitmap
        Bitmap bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);

        //Setting the Bitmap as background for the ImageView
        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setBackgroundDrawable(new BitmapDrawable(bg));

        //Creating the Canvas Object
        Canvas canvas = new Canvas(bg);

        Paint paint0 = new Paint();
        paint0.setColor(Color.MAGENTA);
        paint0.setTextSize(50);

        canvas.drawText("Made by Shantanu", 170, 100, paint0);

        //Creating the Paint Object and set its color & TextSize
        Paint paint1 = new Paint();
        paint1.setColor(Color.RED);
        paint1.setTextSize(50);


        //To draw a Rectangle
        canvas.drawText("Rectangle", 420, 150, paint1);
        canvas.drawRect(400, 200, 650, 600, paint1);

        Paint paint2 = new Paint();
        paint2.setColor(Color.BLUE);
        paint2.setTextSize(50);

        //To draw a Circle
        canvas.drawText("Circle", 120, 150, paint2);
        canvas.drawCircle(200, 350, 150, paint2);

        Paint paint3 = new Paint();
        paint3.setColor(Color.GREEN);
        paint3.setTextSize(50);

        //To draw a Square
        canvas.drawText("Square", 120, 800, paint3);
        canvas.drawRect(50, 850, 350, 1150, paint3);

        Paint paint4 = new Paint();
        paint4.setColor(Color.BLACK);
        paint4.setTextSize(50);


        //To draw a Line
        canvas.drawText("Line", 480, 800, paint4);
        canvas.drawLine(520, 850, 520, 1150, paint4);
    }
}