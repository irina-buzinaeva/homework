package com.company;

public class Main {

    public static void main(String[] args) {
        long month = 1;
        long child = 1;
        long old = 1;
        long rabbits = 1;
        for (int i = 2; i < 32; i++) {
            child = 5*old;
            old = rabbits;
            rabbits = child + old;
        }
        System.out.println(rabbits);
    }
}
