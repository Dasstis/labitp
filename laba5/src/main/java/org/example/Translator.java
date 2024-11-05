package org.example;

import java.util.*;

public class Translator {
    private Map<String, LinkedHashSet<String>> trans = new TreeMap<>(Collections.reverseOrder());

    public void add(String word, String translation) {
        for (Map.Entry<String, LinkedHashSet<String>> entry : trans.entrySet()) {
            if (!entry.getKey().equals(word) && entry.getValue().contains(translation)) {
                System.out.println("Предупреждение: перевод '" + translation + "' уже существует для слова '" + entry.getKey() + "'");
            }
        }


        LinkedHashSet<String> translations = trans.get(word);
        if (translations == null) {
            translations = new LinkedHashSet<>();
            trans.put(word, translations);
        }
        translations.add(translation);
    }

    public void get(String word) {
        System.out.println(trans.get(word));
    }

    public void printAll() {
        System.out.println(trans.entrySet());
    }
}