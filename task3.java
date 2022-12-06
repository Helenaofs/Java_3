// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            list.add(i, rand.nextInt(20));
        }

        System.out.println(list);

        int sum = 0;
        for (int item : list)
            sum += item;

        int avg = sum / list.size();

        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));
        System.out.println("Average: " + avg);
    }
}
