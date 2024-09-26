package org.example;

public enum WallHigh {
    LOW("Низкая", 1), MIDLE("Средняя", 250), HIGH("Высокая", 500),
    SUPER_HIGH("Очень высокая", 750);
    private String title;
    private int height;
    WallHigh(String title, int height)
    {
        this.title = title;
        this.height = height;
    }
    public String getTitle() {return  title;}
    public int getHeight() { return height;}



}
