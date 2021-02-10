package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int indexNull = 0; indexNull < array.length; indexNull++) {
            if (array[indexNull] == null) {
                for (int indexNotNull = indexNull + 1; indexNotNull < array.length; indexNotNull++) {
                    if (array[indexNotNull] != null) {
                        SwitchArray.swap(array, indexNull, indexNotNull);
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
