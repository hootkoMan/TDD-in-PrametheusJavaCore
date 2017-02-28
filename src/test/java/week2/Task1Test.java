package week2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by ruslan on 28.02.17.
 */
public class Task1Test {

    Task1 task1 = new Task1();

    @Test(dataProvider = "rootsOfEquation")
    void executeQuadraticEquation(double k1, double k2, double k3, double x1, double x2) {
        Task1.Root root = task1.solveEquation(k1, k2, k3);

        assertEquals(x1, root.x1);
        assertEquals(x2, root.x2);
    }

    @DataProvider
    Object[][] rootsOfEquation() {
        return new Object[][]{
            {3, 2.5, -0.5, 2, 3},
        };
    }
}
