package week2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by ruslan on 24.03.17.
 */
public class Task4Test {
    Task4 task4 = new Task4();

    @Test(dataProvider = "sortedData", timeOut = 100)
    public void binarySearchTest(int[] sortedArr, int findNumber, int expectedIndex ) {

        int actualIndex = task4.findIndex(sortedArr, findNumber);
        Assert.assertEquals(actualIndex, expectedIndex);

    }

    @DataProvider
    public Object[][] sortedData() {
        return new Object[][]{
            {new int[]{3, 6, 7, 10, 34, 56, 60}, 3, 0},
            {new int[]{3, 6, 7, 10, 34, 56, 60}, 6, 1},
            {new int[]{3, 6, 7, 10, 34, 56, 60}, 7, 2},
            {new int[]{3, 6, 7, 10, 34, 56, 60}, 10, 3},
            {new int[]{3, 6, 7, 10, 34, 56, 60}, 34, 4},
            {new int[]{3, 6, 7, 10, 34, 56, 60}, 56, 5},
            {new int[]{3, 6, 7, 10, 34, 56, 60}, 60, 6},
            {new int[]{3, 6, 7, 10, 34, 56, 60}, 1, -1},
            {new int[]{3, 6, 7, 10, 34, 56, 60}, 13, -1},
            {new int[]{3, 6, 7, 10, 34, 56, 60}, 55, -1},
            {new int[]{3, 6, 7, 10, 34, 56, 60}, 80, -1},
        };
    }
}
