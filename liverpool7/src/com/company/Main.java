package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner ss = new Scanner(in);
        int count = 0;
        for (int i = 7; i < 50; i++) {
            if (i % 7 == 0) {
                count += i;
            }
        }
        System.out.println("Jami" + count);
    }
}