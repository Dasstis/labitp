package org.example;

public class cat extends hous_animals{
    public static int count = 0;
    private static final int catMaxSwimDist = 0;
    public cat(String name, int age, int maxRunDist, String voice){
        super(name, age,maxRunDist,catMaxSwimDist, voice);
        count++;
    }
}
