package org.example;

public class corowa extends hous_animals{
    public static int count = 0;
    //private static final int corowaMaxSwimDist = 0;
    public corowa(String name, int age, int maxRunDist, int maxSwimDist, String voice){
        super(name, age, maxRunDist, maxSwimDist, voice);
        count++;
    }
}
