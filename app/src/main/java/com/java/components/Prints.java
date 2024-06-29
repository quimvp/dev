package com.java.components;

public class Prints {
    public static void printsColor(RGB[] rgb, Object[] args) {
        for (int i = 0; i < args.length; i++) {
            print("\u001B[38;2;" + rgb[i].getR() + ";" + rgb[i].getG() + ";" + rgb[i].getB() + "m" + args[i] + "\u001B[0m");
        }
    }
    public static void printlnsColor(RGB[] rgb, Object[] args) {
        for (int i = 0; i < args.length; i++) {
            println("\u001B[38;2;" + rgb[i].getR() + ";" + rgb[i].getG() + ";" + rgb[i].getB() + "m" + args[i] + "\u001B[0m");
        }
    }

    public static void printColor(RGB rgb, Object args) {
        print("\u001B[38;2;" + rgb.getR() + ";" + rgb.getG() + ";" + rgb.getB() + "m" + args + "\u001B[0m");
    }

    public static void printlnColor(RGB rgb, Object args) {
        println("\u001B[38;2;" + rgb.getR() + ";" + rgb.getG() + ";" + rgb.getB() + "m" + args + "\u001B[0m");
    }

    public static void println() {
        System.out.println();
    }

    public static void print(Object args) {
        System.out.print(args);
    }

    public static void prints(Object... args) {
        for (Object object : args) {
            print(object);
        }
    }

    public static void println(Object args) {
        System.out.println(args);
    }

    public static void printlns(Object... args) {
        for (Object object : args) {
            println(object);
        }
    }

    public static void printf(String s, Object... args) {
        System.out.printf(s, args);
    }

    public static void printfs(String[] s, Object[]... args) {
        for (int i = 0; i < s.length; i++) {
            printf(s[i], args[i]);
        }
    }    

    public static void printfln(String s, Object... args) {
        System.out.printf(s, args);
        println();
    }

    public static void printflns(String[] s, Object[]... args) {
        for (int i = 0; i < s.length; i++) {
            printfln(s[i], args[i]);
        }
    }    
}
