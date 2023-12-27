package com.example.testretrofitexam;

public class CheckArray {
        public static double findMax(double[] array) {
            double[] arrayCheck = {20343.0, 567, 20343, 343.0, 5454};
            double max = arrayCheck[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }
}
