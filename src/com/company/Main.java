package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double[] array = {10.3, -3.2, 30.5, 7, -31, 5.5, 10, 20, -40,
                1.4, -3.4, 84, 9.4, 6.6, 18};
        double kol = 0.0;
        double sum = 0.0;
        boolean switchh = false;

        for (double num : array) {
            if (num < 0) {
                switchh = true;

            }else {
                if (switchh == true){
                    kol++;
                    sum += num;
                }
            }

        }
        System.out.println(sum / kol);

    }
}