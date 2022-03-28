package uz.jl.parking.utils;

import java.util.Scanner;

/**
 * @author Elmurodov Javohir, Mon 9:25 AM. 11/1/2021
 */
public class Print {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private static final Scanner SCANNER_STR = new Scanner(System.in);
    private static final Scanner SCANNER_NUM = new Scanner(System.in);


    public static String getString(String str) {
        return getString(ANSI_BLUE, str);
    }

    public static String getString(String color, String str) {
        System.out.print(color + str + ANSI_RESET);
        return SCANNER_STR.next();
    }

    public static Integer getNumber(String str) {
        return getNumber(ANSI_BLUE, str);
    }

    public static Integer getNumber(String color, String str) {
        System.out.print(color + str + ANSI_RESET);
        return SCANNER_NUM.nextInt();
    }

    public static void print(String str) {
        print(ANSI_BLUE, str);
    }

//    public static void print(String color, String str, Object... objs) {
//        String formattedStr = MessageFormat.format(str, objs);
//        System.out.print(color + formattedStr + ANSI_RESET);
//    }

    public static void print(String color, String str) {
        System.out.print(color + str + ANSI_RESET);
    }

    public static void println(String str) {
        println(ANSI_BLUE, str);
    }

    public static void println(String color, String str) {
        System.out.println(color + str + ANSI_RESET);
    }


}
