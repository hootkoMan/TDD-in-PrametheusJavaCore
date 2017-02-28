package week2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by ruslan on 24.02.17.
 */

public class Task2Test {

    private Task2 task2 = new Task2();

    @Test
    public void someTest() {

        String expected =
            " *  2  3  4  * \n" +
                " 6  *  8  * 10 \n" +
                "11 12  * 14 15 \n" +
                "16  * 18  * 20 \n" +
                " * 22 23 24  * ";

        String actual = task2.createMatrix();

        assertEquals(actual, expected);
    }
}
