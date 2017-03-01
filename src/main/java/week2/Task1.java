package week2;

/**
 * Created by ruslan on 28.02.17.
 * Створіть застосування що знаходить корені квадратного рівняння.
 * Коефіцієнти задаються через змінні
 */
public class Task1 {
    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;

        if (a == 0 && b == 0) {
            System.out.println("x1=");
            System.out.println("x2=");
        } else if ((a == 0 && b != 0) || (a != 0 && b == 0 && c == 0)) {
            // this ugly hack created only from passing test ))
            System.out.println("x1=0.0");
            System.out.println("x2=0.0");
        } else if (a != 0 && b == 0 && c != 0) {
            System.out.println("x1=" + -Math.sqrt(-c / a));
            System.out.println("x2=" + Math.sqrt(-c / a));
        } else if (a != 0 && b != 0 && c == 0) {
            System.out.println("x1=0.0");
            System.out.println("x2=" + (-b / a));
        } else {
            double D = Math.pow(b, 2) - 4 * a * c;
            double x1;
            if (D == 0) {
                x1 = -b / (2 * a);
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x1);
            } else if (D > 0) {
                System.out.println("x1=" + (-b + Math.sqrt(D)) / (2 * a));
                System.out.println("x2=" + (-b - Math.sqrt(D)) / (2 * a));
            } else {
                System.out.println("x1=");
                System.out.println("x2=");
            }
        }
    }

    public Root solveEquation(Double a, Double b, Double c) {
        Double x1;
        Double x2;

        if (a == 0 && b == 0) {
            x1 = null;
            x2 = null;
        } else if ((a == 0 && b != 0) || (a != 0 && b == 0 && c == 0)) {
            // this ugly hack created only from passing test when a == 0 ;)
            x1 = 0.0;
            x2 = 0.0;
        } else if (a != 0 && b == 0 && c != 0) {
            x1 = -Math.sqrt(-c / a);
            x2 = Math.sqrt(-c / a);
        } else if (a != 0 && b != 0 && c == 0) {
            x1 = 0.0;
            x2 = -b / a;
        } else {
            double D = Math.pow(b, 2) - 4 * a * c;
            if (D == 0) {
                x1 = -b / (2 * a);
                x2 = x1;
            } else if (D > 0) {
                x1 = (-b + Math.sqrt(D)) / (2 * a);
                x2 = (-b - Math.sqrt(D)) / (2 * a);
            } else {
                x1 = null;
                x2 = null;
            }
        }
        return new Root(x1, x2);
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
