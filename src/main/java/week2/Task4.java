package week2;

/**
 * Created by ruslan on 23.03.17.
 * Напишіть застосування для сортування масиву методом сортування Шелла (ShellSort).
 */
public class Task4 {
    public static void main(String[] args) {

        int data[] = {3, 6, 7, 10, 34, 56, 60};
        int numberToFind = 10;

        boolean doCycle = true;
        int startIndex = 0;
        int endIndex = data.length - 1;
        int centerIndex = 0;

        while (doCycle) {
            int index = (startIndex + endIndex) / 2;

            centerIndex = centerIndex == index && numberToFind > data[centerIndex]
                ? ++index
                : index;

            if (data[centerIndex] == numberToFind) {
                System.out.println(centerIndex);
                doCycle = false;
            } else if (startIndex + 1 == endIndex) {
                System.out.println(-1);
                doCycle = false;
            } else if (numberToFind > data[centerIndex]) {
                startIndex = centerIndex;
            } else if (numberToFind < data[centerIndex]) {
                endIndex = centerIndex;
            }
        }

    }

    public int findIndex(int[] data, int numberToFind) {
        boolean doCycle = true;
        int startIndex = 0;
        int endIndex = data.length - 1;
        int centerIndex = 0;

        while (doCycle) {
            int index = (startIndex + endIndex) / 2;

            centerIndex = centerIndex == index && numberToFind > data[centerIndex]
                ? ++index
                : index;

            if (data[centerIndex] == numberToFind) {
                System.out.println(centerIndex);
                doCycle = false;
                startIndex = centerIndex;
            } else if (startIndex + 1 == endIndex) {
                System.out.println(-1);
                doCycle = false;
                startIndex = -1;
            } else if (numberToFind > data[centerIndex]) {
                startIndex = centerIndex;
            } else if (numberToFind < data[centerIndex]) {
                endIndex = centerIndex;
            }
        }

        return startIndex;
    }
}
