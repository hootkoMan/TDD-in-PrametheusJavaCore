package week2;

/**
 * Created by ruslan on 22.03.17.
 * Напишіть застосування для сортування масиву методом бульбашки
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        int itemCount = length - 1;
        for (int j = length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    int next = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = next;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void sort(int[] array) {
        for (int j = array.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    int next = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = next;
                }
            }
        }
    }
}
