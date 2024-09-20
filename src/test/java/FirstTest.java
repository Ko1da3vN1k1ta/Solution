import org.example.first_task.First;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FirstTest {
    @Test
    public void testTargetFound() {
        First solution = new First();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] expected = {3, 4};
        assertArrayEquals(expected, solution.searchRange(nums, 8));
    }

    @Test
    public void testTargetNotFound() {
        First solution = new First();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] expected = {-1, -1};
        assertArrayEquals(expected, solution.searchRange(nums, 6));
    }

    @Test
    public void testSingleElementArrayTargetFound() {
        First solution = new First();
        int[] nums = {8};
        int[] expected = {0, 0};
        assertArrayEquals(expected, solution.searchRange(nums, 8));
    }

    @Test
    public void testSingleElementArrayTargetNotFound() {
        First solution = new First();
        int[] nums = {5};
        int[] expected = {-1, -1};
        assertArrayEquals(expected, solution.searchRange(nums, 8));
    }

    @Test
    public void testEmptyArray() {
        First solution = new First();
        int[] nums = {};
        int[] expected = {-1, -1};
        assertArrayEquals(expected, solution.searchRange(nums, 8));
    }
}
