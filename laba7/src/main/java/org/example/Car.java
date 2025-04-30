package org.example;

import java.util.concurrent.CyclicBarrier;
import static org.example.Stage.resultSmp;

public class Car implements Runnable {
    private static CyclicBarrier startBarrier;
    private static CyclicBarrier finalBarrier;
    private static int CARS_COUNT;
    private static final Object monitor = new Object();
    private static int finishedCars = 0;
    private static final String[] winners = new String[3]; // Массив для первых трёх мест
    private static boolean resultsPrinted = false; // Флаг для проверки печати результатов

    static {
        CARS_COUNT = 0;
    }

    private final Race race;
    private final int speed;
    private final String name;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, CyclicBarrier startBarrier, CyclicBarrier finalBarrier) {
        this.race = race;
        this.speed = speed;
        Car.startBarrier = startBarrier;
        Car.finalBarrier = finalBarrier;
        CARS_COUNT++;
        this.name = "Участник №" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");

            startBarrier.await();

            // Прохождение этапов гонки
            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this, i, race);
                resultSmp.release();
            }

            // Фиксация позиции при финише
            synchronized (monitor) {
                if (finishedCars < 3) {
                    winners[finishedCars] = this.name;
                }
                finishedCars++;
            }

            finalBarrier.await();

            // Вывод результатов делает только последняя машина (один раз)
            synchronized (monitor) {
                if (finishedCars == CARS_COUNT && !resultsPrinted) {
                    System.out.println("\n=== ИТОГИ ГОНКИ ===");
                    for (int i = 0; i < Math.min(3, winners.length); i++) {
                        if (winners[i] != null) {
                            System.out.println((i + 1) + " место: " + winners[i]);
                        }
                    }
                    resultsPrinted = true;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}