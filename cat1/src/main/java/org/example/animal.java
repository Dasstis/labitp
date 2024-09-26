package org.example;

abstract class animal {
    protected String name;
    private int age;
    static int count = 0;

    private int maxRunDist;
    private int maxSwimDist;

    public animal(String name, int age, int maxRunDist, int maxSwimDist) {
        this.name = name;
        this.age = age;
        this.maxRunDist = maxRunDist;
        this.maxSwimDist = maxSwimDist;
        count++;
    }

    public void run(int dist){
        System.out.println(this.name + " пробежал " + dist + " метров. ");
    }
    public void swim(int swimDist){
        if (swimDist <= this.maxSwimDist){
            System.out.println(this.name + " проплыл " + swimDist + " метров. ");
        }
        else{
            System.out.println(this.name + " утонул. ");
        }
    }
}
