package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Cat(3, 800, "Биба"),
                new Cat(3, 1, "Боба"),
                new Human(5, 644, "Матвей"),
                new Robot(100, 100, "Василий"),
        };
        Let[] lets =
                {
                        new Treadmill(LeightRoad.LOW),
                        new Treadmill(LeightRoad.LOW),
//                        new Treadmill(LeightRoad.HIGH),
                        new Treadmill(LeightRoad.SUPER_HIGH),
//                        new Wall(WallHigh.LOW),
//                        new Wall(WallHigh.MIDLE),
//                        new Wall(WallHigh.HIGH),
                        new Wall(WallHigh.SUPER_HIGH),

                };
        for (Participant i : participants) {
            for (Let n : lets) {
                if (!n.isCan(i))
                    break;
            }
        }

    }
}