package org.example;

public class dog extends hous_animals {
    public static int count = 0;
    public dog(String name, int age, int maxRunDist, int maxSwimDist, String voice){
        super(name, age, maxRunDist, maxSwimDist, voice);
        count++;
    }

}
