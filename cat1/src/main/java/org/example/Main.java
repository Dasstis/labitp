package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(" Hello and welcome! ");
        animal[] animals = {
                new cat(" Barsik ", 5, 200,  "мяу мяу мяу"),
        new cat("Murzik", 2, 200,  "мяу мяу мяу"),
        new dog("Sharik", 3, 500, 1000, "гав гав гав"),
        new Tiger("Tigra", 4, 1000, 500),
        new homyak("Boba", 2, 200, "фыр фыр фыр"),
        new corowa("Biba",5, 400, 100,"му му му"),
        new coza("Sonya", 1, 100, 50, "бе бе бе")

        };
        for (animal a : animals){
            a.run(300);
            a.swim(200);
            System.out.println();
        }
        new cat(" Barsik ", 5, 200,  "мяу мяу мяу");
        ((hous_animals) animals[0]).voice();
        ((hous_animals) animals[1]).voice();
        ((hous_animals) animals[2]).voice();
        ((hous_animals) animals[4]).voice();
        ((hous_animals) animals[5]).voice();
        ((hous_animals) animals[6]).voice();
        System.out.println();

        System.out.println("Всего животных: " + animal.count + ". Из них говорящих животных: " + hous_animals.count);
        System.out.println();

        System.out.println(" Хомяков: " + homyak.count);
        System.out.println(" Коз: " + coza.count);
        System.out.println(" Коров: " + corowa.count);

        System.out.println(" Котов: " + cat.count);
        System.out.println(" Собак: " + dog.count);
        System.out.println(" Тигров: " + Tiger.count);
    }
}