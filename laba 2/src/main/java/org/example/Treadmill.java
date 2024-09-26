package org.example;

public class Treadmill implements Let{
    String name;
    public Treadmill(LeightRoad roadLeight){
        this.name = roadLeight.getTitle();
        this.roadLenght = roadLeight.getLenght();
    }
    int roadLenght;
    @Override
    public boolean isCan(Participant participant){
        return participant.run(roadLenght);
    }
}
