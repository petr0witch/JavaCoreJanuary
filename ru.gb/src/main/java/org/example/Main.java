package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[] {1,2,3,4,5,6,7,8,9,10};
        //1. Написать метод, возвращающий количество чётных элементов массива.
        //System.out.println(check(array));

        //2. Написать функцию, возвращающую разницу между самым большим
        // и самым маленьким элементами переданного не пустого массива.
        System.out.println(deference(array));
    }

    //2.
    static int deference(int[] arr){
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[min] > arr[i]) min = i;
            for (int j = 0; j < arr.length ; j++) {
                if(arr[max] < arr[i]) max = i;
            }
        }
        int def = max - min;
        return def;
    }


    //1.
//    static int check(int[] arr){
//        int count = 0;
//        for (int item: arr) {
//            if (item %2 ==0) count++;
//        }
//        return count;
//    }
}