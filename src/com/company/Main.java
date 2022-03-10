package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here
        int i = 0;
        while (i < 15) {
            System.out.println("Line " + ++i);
            Thread.sleep(100);
        }
        while (true) {
            System.out.print("\r Line cleared " + ++i);
            Thread.sleep(300);
        }
    }
}
