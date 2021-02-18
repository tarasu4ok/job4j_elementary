package ru.job4j.live;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        String numStr = "12345";
        System.out.println(numStr.charAt(0));
        int num =  numStr.charAt(0) - '0';
        int num2 = Character.getNumericValue(numStr.charAt(0));
        System.out.println(num);
        System.out.println(num2);
    }
}
