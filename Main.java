package com.netology.homework.streamapiv0;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main implements Comparable {

    public static void main(String[] args) {
        System.out.println("Вариант без стрима");
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        for (int i :
                intList) {
            intList.sort(Comparator.naturalOrder());
            if (i > 0 && i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
