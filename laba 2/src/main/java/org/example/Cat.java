package org.example;

public class Cat implements Participant {
   int maxHight;
   int maxLenght;
   String name;
   private static int superRunCount = 1;
   public Cat(int maxHight, int maxLenght, String name)
   {
       this.maxHight = maxHight;
       this.maxLenght = maxLenght;
       this.name = name;
   }
   @Override
    public boolean run(int dist){
       if (dist <= maxLenght){
           System.out.println((this.name + " пробежал " + dist + "М"));
           return true;
       } else if (superRunCount != 0){
           System.out.println(this.name + " пробежал с помощью супер умения ");
           superRunCount--;
           return true;
       } else {
           System.out.println(this.name + " не смог пробежать " + dist + "М");
           return false;
       }
   }
   @Override
    public  boolean jump(int height)
   {
       if (height <= maxHight)
       {
           System.out.println((this.name + " перепрыгнул " + height + "М"));
           return true;
       }
       else {
           System.out.println(this.name + " не смог перепрыгнуть " + height + "М");
           return true;
       }
   }

}
