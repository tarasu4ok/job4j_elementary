package ru.job4j.array;

public class FindLoop {

    /**
     * Метод ищет элемент в массиве
     * Вовращает индекс искомого элемента. Если не найден, возвращает -1
     * @param data массив
     * @param el искомый элемент
     */
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Метод ищет элемент в массиве в заданном интервале индексов
     * Вовращает индекс искомого элемента. Если не найден, возвращает -1
     * @param data массив
     * @param el искомый элемент
     * @param start индекс начала интервала поиска
     * @param finish индекс конца интервала поиска
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
