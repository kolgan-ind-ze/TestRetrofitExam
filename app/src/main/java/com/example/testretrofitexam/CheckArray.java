package com.example.testretrofitexam;

public class CheckArray {
    public static boolean findMax(double check) {
        double[] array = {245, 567, 234, 343, 343.3, 433.343, 33, 5454, 45, 323, 20343.0};
        for (int i = 1; i < array.length; i++) {
            if (array[i] < check) {
                return true;
            }
        }
        return false;
    }
}
