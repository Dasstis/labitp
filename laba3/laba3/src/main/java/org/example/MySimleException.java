package org.example;

public class MySimleException extends RuntimeException {
    private int j;
    private int i;
    private String s;
    public MySimleException(int i, int j, String s) {
        super("Найдено моё простое число " + s + " в ячейке номер "  + (i + 1) + " x " + (j + 1));
        this.i = i;
        this.j = j;
        this.s = s;
    }
}
