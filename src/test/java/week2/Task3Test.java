package week2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ruslan on 22.03.17.
 */
public class Task3Test {
    private Task3 task3 = new Task3();

    @Test
    public void bubbleSortTest() {
        int[] arr = {3, 1, 4, 2};
        task3.sort(arr);
        int[] expectedArr = {1, 2, 3, 4};
        Assert.assertArrayEquals(expectedArr, arr);
    }
}
