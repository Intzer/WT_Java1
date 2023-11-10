package main.java.by.bsuir.lab1.task7;

public class Resolver {

    public static void bubbleSort(double[] array) {
        int n = array.length;
        boolean swapped;

        do {
            swapped = false;

            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    // Обмен элементов
                    double temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;

                    swapped = true;
                }
            }

            // Уменьшаем размер массива на 1, так как самый большой элемент уже находится в конце
            n--;
        } while (swapped);
    }
}
