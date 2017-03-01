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
    void executeQuadraticEquation(Double a, Double b, Double c, Double x1, Double x2) {
        Task1.Root root = task1.solveEquation(a, b, c);

        assertEquals(root.x1, x1 ,"param: " + a + ", " + b + ", " + c);
        assertEquals(root.x2, x2, "param: " + a + ", " + b + ", " + c);
    }

    @DataProvider
    Object[][] rootsOfEquation() {
        return new Object[][]{
            {2.0, 3.0, 4.0, null, null},
            {1.0, 4.0, -21.0, 3.0, -7.0},
            {3.0, 2.5, -0.5, 0.16666666666666666, -1.0},
            {0.0, 0.0, 9999999999.0, null, null},
            {0.0, 10, 0.0, 0.0, 0.0},
            {3.0, -18.0, 27.0, 3.0, 3.0},
        };
    }
}
