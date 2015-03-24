package com.liquidmovementproductions.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by oscarestrada on 2/10/15.
 */
public class Colorwheel {

    public String mColors[] = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };


    private Random randomGenerator = new Random();
    public int getColor() {


        // Randomly select a color

        return Color.parseColor(mColors[randomGenerator.nextInt(mColors.length)]);
    }
}