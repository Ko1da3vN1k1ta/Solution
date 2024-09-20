import org.example.second_task.Second;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondTest {

    @Test
    public void testExample1() {
        Second solution = new Second();
        int[] nums = {2, 7, 11, 15};
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, 9));
    }

    @Test
    public void testExample2() {
        Second solution = new Second();
        int[] nums = {3, 2, 4};
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.twoSum(nums, 6));
    }

    @Test
    public void testExample3() {
        Second solution = new Second();
        int[] nums = {3, 3};
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, 6));
    }

    @Test
    public void testNoSolution() {
        Second solution = new Second();
        int[] nums = {1, 2, 3, 4};
        int[] expected = {-1, -1};
        assertArrayEquals(expected, solution.twoSum(nums, 10));
    }

    @Test
    public void testMixedNumbers() {
        Second solution = new Second();
        int[] nums = {-3, 4, 3, 90};
        int[] expected = {0, 2};
        assertArrayEquals(expected, solution.twoSum(nums, 0));
    }
}
