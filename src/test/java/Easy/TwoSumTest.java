package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void test1() {
        TwoSum task = new TwoSum();
        int[] inputArray = new int[]{2, 7, 11, 15};
        int inputTarget = 9;
        int[] actual = task.Solution(inputArray, inputTarget);
        int[] expected = new int[]{0, 1};

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i], "i = " + i);
        }
    }

    @Test
    void test2() {
        TwoSum task = new TwoSum();
        int[] inputArray = new int[]{3, 2, 4};
        int inputTarget = 6;
        int[] actual = task.Solution(inputArray, inputTarget);
        int[] expected = new int[]{1, 2};

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i], "i = " + i);
        }
    }

    @Test
    void test3() {
        TwoSum task = new TwoSum();
        int[] inputArray = new int[]{3, 3};
        int inputTarget = 6;
        int[] actual = task.Solution(inputArray, inputTarget);
        int[] expected = new int[]{0, 1};

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i], "i = " + i);
        }
    }
}