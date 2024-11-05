package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] arrayWord = {"Car", "Car", "Морозилка", "Морозилка", "Очки", "Очки", "Ноутбук", "Очки", "Мегафон", "Котик"};
        Map<String, Integer> listWord = new LinkedHashMap<>();
        for (String s : arrayWord) {
            listWord.put(s, listWord.getOrDefault(s, 0) + 1);
        }
        System.out.println(listWord.keySet());
        System.out.println(listWord.entrySet());


        Translator t = new Translator();

        t.add("Автор", "Autor");
        t.add("Автор", "Creator");

        t.add("Красивый", "Googly");

        t.add("Человек", "Human");
        t.add("Человек", "Person");
        t.add("Человек", "People");

        t.add("Код", "Code");
        t.add("Код2", "Code");
        t.add("Автор", "Autor2");
        t.add("Ааа", "Autor2");


        t.get("Автор");
        t.printAll();

    }
}
