package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" month = ");
        int month = input.nextInt();

        System.out.print(" n = ");
        int n = input.nextInt();
        input.close();

        long[] F = new long[month + 1];
        long[] rabit = new long[n];
        rabit[0] = 1;
        F[1] = 1;

        for (int i = 2; i <= month; i++) {

            long[] next = new long[n];
            for (int j = 1; j < n; j++) {
                next[j] = rabit[j - 1];
                next[0] += rabit[j];
            }

            for (int k = 0; k < n; k++) {
                rabit[k] = next[k];
                F[i] += rabit[k];
            }
        }
        System.out.println(F[month]);
    }
}
