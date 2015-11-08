package com.example.bridge;

/**
 * Created by Brenda on 11/8/2015.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x +
                ", " + y + "]");
    }
}
