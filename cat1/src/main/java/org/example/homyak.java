package org.example;

public class homyak extends hous_animals{
    public static int count = 0;
    private static final int homyakMaxSwimDist = 0;
    public homyak(String name, int age, int maxRunDist, String voice){
        super(name, age, maxRunDist, homyakMaxSwimDist, voice);
        count++;
    }
}
