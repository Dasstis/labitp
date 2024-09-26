package org.example;

public class coza extends hous_animals{
    public static int count = 0;
    //private static final int cozaMaxSwimDist = 0;
    public coza(String name, int age, int maxRunDist, int maxSwimDist, String voice){
        super(name, age, maxRunDist, maxSwimDist, voice);
        count++;
    }
}
