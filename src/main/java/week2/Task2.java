package week2;

/**
 * Created by ruslan on 27.02.17.
 * Використовуючи цикл for виведіть на екран матрицю (in test).
 */
public class Task2 {

    public String createMatrix() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0, cell = 1, rows = 5; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (j == i || j + 1 == rows - i) {
                    sb.append(String.format("%3S", "* "));
//                    System.out.printf("%3S", "* ");
                } else {
                    sb.append(String.format("%3S", cell + " "));
//                    System.out.printf("%3S", cell+ " ");
                }
                cell++;
                if (j == rows - 1 && i != rows - 1) {
                    sb.append("\n");
//                    System.out.println();
                }
            }
        }

        return sb.toString();
    }
}
