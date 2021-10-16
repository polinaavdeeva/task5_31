package ru.vsu.cs.avdeeva_p_a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int s = readValue();

        printPicture(s);
    }

    private static void printPicture(int s) {
        printUpperLine((s / 2) + 1, 0, s / 2);

        int symbol = s / 2 + 1;
        int space = -1;

        for (int i = 0; i < s / 2 - 1; i++) {
            symbol--;
            space += 2;
            printUpperLine(symbol, space, symbol);
        }

        printCenterLine(s - 2);

        printLowerLine(symbol, space, symbol);

        for (int i = 0; i < s / 2 - 2; i++) {
            symbol++;
            space -= 2;
            printLowerLine(symbol, space, symbol);
        }

        printLowerLine(s / 2, 0, s / 2 + 1);
    }

    private static void printUpperLine(int hashtag, int space, int star) {

        for (int i = 0; i < hashtag; i++) {
            System.out.print("#");
        }

        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }

        System.out.println();
    }

    private static void printCenterLine(int space) {
        System.out.print("#");

        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }

        System.out.print("#");
        System.out.println();
    }

    private static void printLowerLine(int hashtag, int space, int star) {

        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }

        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < hashtag; i++) {
            System.out.print("#");
        }

        System.out.println();
    }

    private static int readValue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input S (picture size) = ");
        int value = sc.nextInt();

        if (value < 3) {
            System.out.println("'S' (picture size) cannot be less then 3 or be an even number. Please, try again.");
            System.exit(1);
        } else if (value % 2 == 0) {
            System.out.println("'S' (picture size) cannot be less then 3 or be an even number. Please, try again.");
            System.exit(1);
        }
        return value;
    }

}