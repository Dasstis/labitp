package org.example;

public class Wall implements Let {
    private int wallHeight;
    public  Wall(WallHigh wallHeigh){
        this.height = wallHeigh.getHeight();
        this.title = wallHeigh.getTitle();
    }
    int height;
    String title;
    @Override
    public boolean isCan(Participant participant){
        return participant.jump(height);
    }
}
