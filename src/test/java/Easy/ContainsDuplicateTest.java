package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
    ContainsDuplicate task = new ContainsDuplicate();
    @Test
    void test1() {
        int[] input = new int[] {1,2,3,1};
        boolean actual = task.solution(input);
        boolean expected = true;

        assertEquals(expected,actual);
    }

    @Test
    void test2() {
        int[] input = new int[] {1,2,3,4};
        boolean actual = task.solution(input);
        boolean expected = false;

        assertEquals(expected,actual);
    }

    @Test
    void test3() {
        int[] input = new int[] {1,1,1,3,3,4,3,2,4,2};
        boolean actual = task.solution(input);
        boolean expected = true;

        assertEquals(expected,actual);
    }
}