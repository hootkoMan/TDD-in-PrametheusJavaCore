package week2;

/**
 * Created by ruslan on 28.02.17.
 * Створіть застосування що знаходить корені квадратного рівняння.
 * Коефіцієнти задаються через змінні
 */
public class Task1 {
    public static void main(String[] args) {
//        double a = 3;
//        double b = 2.5;
//        double c = -0.5;

    }

    public Root solveEquation(Double a, Double b, Double c) {
        Double x1;
        Double x2;

        Double D = Math.pow(b, 2) - 4 * a * c;  //16 - -84 = 100

        if (D == 0) {
            x1 = x2 = -(b / 2 * a);
        } else if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / 2 * a;
            x2 = (-b - Math.sqrt(D)) / 2 * a;
        } else {
            x1 = null;
            x2 = null;
        }


        Root root = new Root(x1, x2);
        System.out.println("D = " + D);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

//        return new Root(1, 2);
        return root;
    }

    class Root {
        Double x1;
        Double x2;

        public Root(Double x1, Double x2) {
            this.x1 = x1;
            this.x2 = x2;
        }
    }
}
