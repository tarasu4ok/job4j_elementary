package ru.job4j.condition;

public class ChessBoard {
    public static boolean correctRange(int a) {
        return a >= 0 && a <= 7;
    }

    public static int wayRook(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 == x2 || y1 == y2) {
            rsl = Math.abs(x2 - x1);
            rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
        }
        return rsl;
    }

    public static int wayBishop(int x1, int y1, int x2, int y2) {
        return  correctRange(x1) && correctRange(y1) && correctRange(x2) && correctRange(y2) && Math.abs(x2 - x1) == Math.abs(y2 - y1) ? Math.abs(x2 - x1) : 0;
    }

    public static void main(String[] args) {
        System.out.println(wayBishop(1, 1, 1, 2));  // ходит не по диаганоли
        System.out.println(wayBishop(0, 5, 2, 7));  // корректный
        System.out.println(wayBishop(2, 7, 6, 3));  // корректный
        System.out.println(wayBishop(8, 3, 13, 8)); // некорректный диапазон
    }
}
