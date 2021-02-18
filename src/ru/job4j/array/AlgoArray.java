package ru.job4j.array;

public class AlgoArray {

    /**
     * Метод меняет местами два элемента массива
     * @param array
     * @param firstEl
     * @param secondEl
     */
    public static void replaceElements(int[] array, int firstEl, int secondEl) {
        int temp = array[firstEl];
        array[firstEl] = array[secondEl];
        array[secondEl] = temp;
    }

    /**
     * Упорядочиваем массив путём перестановки элементов местами в следующем порядке:
     * 0 <-> 3, 1 <-> 2, 3 <-> 4
     * @param args
     */
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        replaceElements(array, 0, 3);
        replaceElements(array, 1, 2);
        replaceElements(array, 3, 4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
