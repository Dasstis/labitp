package org.example;

import javax.xml.namespace.QName;

abstract class hous_animals extends animal{
    public static int count = 0;
    public String voice;
    public hous_animals(String name, int age, int maxSwimDist, int maxRunDist, String voice){
     super(name, age, maxRunDist, maxSwimDist);
     this.voice = voice;
     count++;
    }
    public  void voice(){ System.out.println(this.name + " говорит " + this.voice);}
}
