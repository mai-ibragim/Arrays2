package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random ran = new Random();
        int[] arrays = new int[5];

        for (int i = 1; i < arrays.length; i++) {
            arrays[i] = ran.nextInt(100);
        }

        for (int i = 1; i < arrays.length; i++) {
            System.out.println(arrays[i]);

            if(arrays[i] % 2 == 0) {
                System.out.print("Even numbers: " + arrays[i] + " ");
            } 
        }
    }
}
