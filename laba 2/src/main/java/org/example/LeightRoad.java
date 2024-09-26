package org.example;

public enum LeightRoad {
    LOW("Низкая", 1), MIDLE("Средняя", 250), HIGH("Высокая", 500),
    SUPER_HIGH("Очень высокая", 750);
    private String title;
    private int lenght;
    LeightRoad(String title, int lenght){
        this.title = title;
        this.lenght = lenght;

    }
    public String getTitle()
    {
        return title;
    }
    public int getLenght(){
        return lenght;
    }
}
